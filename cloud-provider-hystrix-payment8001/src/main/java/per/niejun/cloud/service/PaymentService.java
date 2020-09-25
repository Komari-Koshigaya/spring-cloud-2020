package per.niejun.cloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/25 21:43
 **/
@Service
public class PaymentService {
    public String paymentInfoOk(Integer id){
        return "线程池:  "+Thread.currentThread().getName()+"  paymentInfo_OK,id:  "+id+"\t"+"O(∩_∩)O哈哈~";
    }

    public String paymentInfoTimeOut(Integer id){
        int timeNumber =3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:  "+Thread.currentThread().getName()+"  paymentInfoTimeOut,id:  "+id+"\t"+"O(∩_∩)O哈哈~"+"  耗时(秒): " + timeNumber;

    }

}
