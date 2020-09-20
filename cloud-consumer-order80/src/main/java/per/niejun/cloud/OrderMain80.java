package per.niejun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import per.niejun.myrule.MyselfRule;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/12 22:01
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
        System.out.println("      /¯¯¯¯\\     \n" +
                "    o-|[][]|-o   \n" +
                "      |_--_|     \n" +
                "   /¯¯¯¯¯¯¯¯¯¯\\  \n" +
                "   |||  «»  |||  \n" +
                "   |||      |||  \n" +
                "  (o)|      |(o) \n" +
                "     |  ||  |    \n" +
                "     |__||__|    \n" +
                "     |__||__|");
    }
}
