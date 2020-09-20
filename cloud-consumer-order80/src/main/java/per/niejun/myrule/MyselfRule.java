package per.niejun.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author NieJun
 * @Description ribbon的自定义规则不能带有 @ComponentScan
 * 而springboot的启动类的@SpringBootApplication里面就包含了@ComponentScan
 * 且其可以扫描当前文件夹的所有文件 故自定义规则要跳出其范围
 * @Date 2020/9/20 22:03
 **/
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule() {
        //定义为随机
        return new RandomRule();
    }
}
