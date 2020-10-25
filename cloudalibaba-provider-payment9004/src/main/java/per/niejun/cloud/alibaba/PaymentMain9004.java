package per.niejun.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/25 16:47
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9004.class, args);
        System.out.println(
                "    ____     \n" +
                "   (__  '.   \n" +
                "    /_____)  \n" +
                "   ()@ @ ))) \n" +
                "    'C ,()(()\n" +
                "    ,.'_'.' \\\n" +
                " __/ )   (--'\n" +
                "'._./     \\  \n" +
                "   (_._._._) \n" +
                "    _|| ||_  \n" +
                "mrf(__.).__) "
        );
    }
}
