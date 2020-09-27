package per.niejun.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Araragi
 * @date 2020年9月27日 10点33分
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentHystrixService {
    /**
     * 使用 OpenFeign 向服务提供者 发送http请求
     * 对应的url： http://CLOUD-PROVIDER-HYSTRIX-PAYMENT/payment/hystrix/ok/{id}
     * 函数名随便取 可以与CLOUD-PROVIDER-HYSTRIX-PAYMENT的controller层不一致
     * @param id
     * @return
     */
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfoOK2(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeOut2(@PathVariable("id") Integer id);
}