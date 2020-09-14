package per.niejun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/14 10:18
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
        System.out.println(
                "                             ,                                 \n" +
                        "                              \\`-,                             \n" +
                        "                              |   `\\                           \n" +
                        "                              |     \\                          \n" +
                        "                           __/.- - -.\\,__                      \n" +
                        "                      _.-'`              `'\"'--..,__           \n" +
                        "                  .-'`                              `'--.,_    \n" +
                        "               .'`   _                         _ ___       `)  \n" +
                        "             .'   .'` `'-.                    (_`  _`)  _.-'   \n" +
                        "           .'    '--.     '.                 .-.`\"`@ .-'\"\"-,   \n" +
                        "  .------~'     ,.---'      '-._      _.'   /   `'--'\"\"\"\".-'   \n" +
                        "/`        '   /`  _,..-----.,__ `''''`/    ;__,..--''--'`      \n" +
                        "`'--.,__ '    |-'`             `'---'|     |                   \n" +
                        "        `\\    \\                       \\   /                    \n" +
                        "         |     |                       '-'                     \n" +
                        "          \\    |                                               \n" +
                        "          `\\  |                                               \n" +
                        "             \\/                                                ");
    }
}