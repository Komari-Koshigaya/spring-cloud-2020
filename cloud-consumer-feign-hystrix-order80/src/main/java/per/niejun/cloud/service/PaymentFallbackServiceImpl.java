package per.niejun.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author NieJun
 * @Description 使用PaymentFallbackServiceImpl实现PaymentHystrixService，
 * 在实现类里写fallback，将fallback与controller层的业务逻辑分离
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