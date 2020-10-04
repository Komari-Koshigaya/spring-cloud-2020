package per.niejun.cloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/25 21:43
 **/
@Service
public class PaymentService {
    public String paymentInfoOk(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + "  paymentInfo_OK,id:  " + id + "\t" + "O(∩_∩)O哈哈~";
    }

    /**
     * =============>服务降级服务端 一般服务降级都放在客户端
     * 一旦调用服务方法失败抛出错误信息后，会自动调用@HystrixCommand 标注的fallbackMethod调用类中的指定方法
     * 在 @HystrixProperty 设置自身调用超时时间的峰值，峰值内可以正常运行，
     * 超过了调用 fallbackMethod 里的兜底方法处理作服务降级 fallback
     *
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfoTimeOut(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //除零异常 非超时 兜底的方案仍然是 paymentInfoTimeOutHandler
        //int age = 10 /0;
        return "线程池:  " + Thread.currentThread().getName() + "  id:  " + id + "\t" + "O(∩_∩)O哈哈~";
    }

    /**
     * 一旦调用服务paymentInfoTimeOut失败抛出错误信息后，会自动调用 本方法发
     * Hystrix 出错兜底方法
     *
     * @param id
     * @return
     */
    public String paymentInfoTimeOutHandler(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + "  系统繁忙或者运行报错，请稍后再试,id:  " + id + "\t" + "(￣﹏￣；)";
    }

    /**
     * =============>服务熔断: 熔断打开 熔断半开 熔断关闭
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),// 失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("******id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName() + "\t" + "调用成功，流水号: " + serialNumber;
    }

    public String paymentCircuitBreakerFallback(@PathVariable("id") Integer id) {
        return "id 不能负数，请稍后再试，/(ㄒoㄒ)/~~   id: " + id;
    }
}
