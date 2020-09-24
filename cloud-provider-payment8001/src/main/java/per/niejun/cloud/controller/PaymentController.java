package per.niejun.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import per.niejun.cloud.entities.CommonResult;
import per.niejun.cloud.entities.Payment;
import per.niejun.cloud.service.PaymentService;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/12 20:11
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.debug("插入结果: " + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功，(#`O′),serverPort: " + serverPort, result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.debug("查询结果: " + payment);

        if (payment != null) {
            return new CommonResult(200, "查询成功，(*^_^*),serverPort: " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有结果，查询id：" + id, null);
        }
    }

    /**
     *     打印支付微服务的端口号 来 测试手写的轮询算法
     */
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    /**
     * 测试openfeign的超时控制
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
