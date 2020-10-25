package per.niejun.cloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import per.niejun.cloud.entities.CommonResult;
import per.niejun.cloud.entities.Payment;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/25 17:29
 **/
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}