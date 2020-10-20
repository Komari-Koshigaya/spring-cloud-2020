package per.niejun.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/20 9:38
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
        System.out.println(
            "        .-  -.        .-====-.      ,-------.      .-=<>=-.\n" +
            "    /_-\\'''/-_\\      / / '' \\ \\     |,-----.|     /__----__\\\n" +
            "  |/  o) (o  \\|    | | ')(' | |   /,'-----'.\\   |/ (')(') \\|\n" +
            "  \\   ._.   /      \\ \\    / /   {_/(') (')\\_}   \\   __   /\n" +
            "  ,>-_,,,_-<.       >'=jf='<     `.   _   .'    ,'--__--'.\n" +
            "  /      .      \\    /        \\     /'-___-'\\    /    :|    \\\n" +
            "  (_)     .     (_)  /          \\   /         \\  (_)   :|   (_)\n" +
            "  \\_-----'____--/  (_)        (_) (_)_______(_)   |___:|____|\n" +
            "  \\___________/     |________|     \\_______/     |_________|"
        );
    }
}
