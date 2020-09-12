package per.niejun.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import per.niejun.cloud.entities.CommonResult;
import per.niejun.cloud.entities.Payment;
import per.niejun.cloud.service.PaymentService;

import javax.annotation.Resource;

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

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.debug("插入结果: " + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功，(#`O′)", result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.debug("查询结果: " + payment);

        if (payment != null) {
            return new CommonResult(200, "查询成功，(*^_^*)", payment);
        } else {
            return new CommonResult(444, "没有结果，查询id：" + id, null);
        }
    }
}
