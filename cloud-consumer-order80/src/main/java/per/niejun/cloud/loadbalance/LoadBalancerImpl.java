package per.niejun.cloud.loadbalance;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/22 21:23
 **/
@Component
@Slf4j
public class LoadBalancerImpl implements LoadBalancer {
    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 使用 CAS + 自旋锁 返回当前是第几次访问
     * @return
     */
    public final int getAndIncrement() {
        int current;
        int next;

        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        log.info("*****第几次访问，次数next: " + next);
        return next;
    }

    /**
     *     负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标  ，每次服务重启动后rest接口计数从1开始。
     *     自己实现的轮询算法 返回服务实例
     * @param serviceInstances
     * @return
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
