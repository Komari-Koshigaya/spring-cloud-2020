package per.niejun.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/12 22:14
 **/
@Configuration
public class ApplicationContextConfig {
    /**
     * 开启 @LoadBalanced 注解  赋予 RestTemplate 负载均衡能力
     * 为了证明负载均衡是由于手写的轮询算法 可以将其注释
     */
    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
