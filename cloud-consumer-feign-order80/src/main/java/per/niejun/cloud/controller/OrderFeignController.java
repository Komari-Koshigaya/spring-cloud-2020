package per.niejun.cloud.controller;

import feign.Param;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import per.niejun.cloud.entities.CommonResult;
import per.niejun.cloud.entities.Payment;
import per.niejun.cloud.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/23 21:53
 **/
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign 超时控制测试， openfeign-ribbon 客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
