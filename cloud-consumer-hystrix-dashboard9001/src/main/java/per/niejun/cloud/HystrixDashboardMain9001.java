package per.niejun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/9 11:07
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
        System.out.println(
                "          /\\/\\/\\/\\        \n" +
                "         /       /        \n" +
                "        (. (.  )          \n" +
                "         (      ]         \n" +
                "        /____  /          \n" +
                "         \\     |          \n" +
                "         /-----\\          \n" +
                "       / /     /  \\       \n" +
                "     / \\/       \\/  \\     \n" +
                "   / / /           \\  \\   \n" +
                " ((()  /__________\\ (/\\)))\n" +
                "        /         \\       \n" +
                "        |    /\\    \\      \n" +
                "        ----| |----       \n" +
                "        |__ |  \\__ \\      \n" +
                "       {____|   {___}     \n" +
                "=======================/  \n" +
                "   (o)           (o)      "
        );
    }
}
