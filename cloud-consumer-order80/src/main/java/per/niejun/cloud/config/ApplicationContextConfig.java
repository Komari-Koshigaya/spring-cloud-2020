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
    @Bean
    @LoadBalanced       // 使用 @LoadBalanced 注解 赋予 RestTemplate 负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
