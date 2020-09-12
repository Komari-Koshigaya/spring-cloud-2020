package per.niejun.cloud.service.impl;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import per.niejun.cloud.dao.PaymentDao;
import per.niejun.cloud.entities.Payment;
import per.niejun.cloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/12 20:08
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }

}
