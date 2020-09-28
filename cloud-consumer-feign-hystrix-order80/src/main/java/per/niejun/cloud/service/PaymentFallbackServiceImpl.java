package per.niejun.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/28 20:39
 **/
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfoOK2(Integer id) {
        return "-----PaymentFallbackService fallback paymentInfoOK2 ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut2(Integer id) {
        return "-----PaymentFallbackService fall-back paymentInfoTimeOut2 ,o(╥﹏╥)o";
    }

}