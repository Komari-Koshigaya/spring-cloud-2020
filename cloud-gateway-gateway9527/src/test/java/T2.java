
import java.time.ZonedDateTime;

/**
 * @Author NieJun
 * @Description  如何获取GetWay 配置的日期格式 2020-10-11T17:12:14.875+08:00[Asia/Shanghai]
 * @Date 2020/10/11 17:10
 **/

public class T2 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();//默认时区
        System.out.println(now);//2020-10-11T17:12:14.875+08:00[Asia/Shanghai]
    }
}
