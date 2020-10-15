package per.niejun.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import per.niejun.cloud.service.IMessageProvider;

import javax.annotation.Resource;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/15 10:15
 **/
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }

}
