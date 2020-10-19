package per.niejun.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/19 15:03
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
        System.out.println(
            "               _____________________   \n" +
            "              /                    /\\()\n" +
            "             /                    /  `.\n" +
            "            /                    /  .,'\n" +
            "           /____________________/_.-`  \n" +
            "           (_____________________()    \n" +
            "           || ||                       \n" +
            "           || || _                     \n" +
            "           ||/|/  /|_____      _       \n" +
            "           || /  / /     /|  .//|      \n" +
            "           ||/  / /     / |__// /-.    \n" +
            "         ,'|/_ / /     / /  // /    \". \n" +
            "       ,'  || | /     / /  // /       \"\n" +
            "     ,-__. || |/     / /  ||/__-.     \"\n" +
            "   ,\" |__`.||_|_____/_/____.'__| \"   ' \n" +
            "   \"   O_) ________________ (_O   \" '  \n" +
            "   \"   |_.' \"            \" `._|   \"    \n" +
            "akg`.      ,'            `.      ,'    \n" +
            "     `----'                `---        ");
    }
}
