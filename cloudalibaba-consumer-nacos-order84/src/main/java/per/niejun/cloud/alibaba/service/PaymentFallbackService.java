package per.niejun.cloud.alibaba.service;

import org.springframework.stereotype.Component;
import per.niejun.cloud.entities.CommonResult;
import per.niejun.cloud.entities.Payment;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/25 17:32
 **/
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}