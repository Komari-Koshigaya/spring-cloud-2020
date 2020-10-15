package per.niejun.cloud.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import per.niejun.cloud.service.IMessageProvider;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/15 10:06
 **/
@Slf4j
@EnableBinding(Source.class)   //定义消息的推送管道
public class IMessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;      //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.warn("*****serial: " + serial);
        return null;
    }
}
