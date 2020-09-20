package per.niejun.cloud.service;

import org.apache.ibatis.annotations.Param;
import per.niejun.cloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
