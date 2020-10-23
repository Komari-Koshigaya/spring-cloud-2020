package per.niejun.cloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import per.niejun.cloud.entities.CommonResult;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/10/23 19:56
 **/
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}

