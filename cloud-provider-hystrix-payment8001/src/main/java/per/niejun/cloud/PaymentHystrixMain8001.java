package per.niejun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/25 21:40
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class, args);
        System.out.println("" +
                "     .--..--..--..--..--..--.             \n" +
                "    .' \\  (`._   (_)     _   \\            \n" +
                "  .'    |  '._)         (_)  |            \n" +
                "  \\ _.')\\      .----..---.   /            \n" +
                "  |(_.'  |    /    .-\\-.  \\  |            \n" +
                "  \\     0|    |   ( O| O) | o|            \n" +
                "   |  _  |  .--.____.'._.-.  |            \n" +
                "   \\ (_) | o         -` .-`  |            \n" +
                "    |    \\   |`-._ _ _ _ _\\ /             \n" +
                "    \\    |   |  `. |_||_|   |             \n" +
                "    | o  |    \\_      \\     |     -.   .-.\n" +
                "    |.-.  \\     `--..-'   O |     `.`-' .'\n" +
                "  _.'  .' |     `-.-'      /-.__   ' .-'  \n" +
                ".' `-.` '.|='=.='=.='=.='=|._/_ `-'.'     \n" +
                "`-._  `.  |________/\\_____|    `-.'       \n" +
                "   .'   ).| '=' '='\\/ '=' |               \n" +
                "   `._.`  '---------------'               \n" +
                "           //___\\   //___\\                \n" +
                "             ||       ||                  \n" +
                "    LGB      ||_.-.   ||_.-.              \n" +
                "            (_.--__) (_.--__)             ");
    }
}
