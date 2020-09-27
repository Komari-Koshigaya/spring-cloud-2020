package per.niejun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author NieJun
 * @Description TODO
 * @Date 2020/9/26 22:27
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
        System.out.println("" +
                "                                                                                   iii                                       \n" +
                "                                                                 ii         ,iiiiiiiii                                       \n" +
                "                                                             ,iiiiii       iiiiiiiiiiiii                                     \n" +
                "                                                            iiiiiiiii  iiiiiiiiiiiiiiiii                                     \n" +
                "                                                             iiiiiiiiiiiiiiiiiiiiiiiiiiiii                                   \n" +
                "                                                             ,iiiiiiiiiiiiiiiiiiiiiiiiiii                                    \n" +
                "                                                   iiiiii@@@@iiiiiiiiiiiiiiiiiiiiiiiiiii                                     \n" +
                "                                             ii@@@@@@@@@@@@@@@@@@@@@@@@iiiiiiiiiiiiiiii                                      \n" +
                "                                         iii@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@iiiiiiiiiiiiiiiii                                \n" +
                "                                      ii@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@iiiiiiiiiiiii                               \n" +
                "                                  ii@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@iiiiiiiiiiiii                              \n" +
                "                               ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@iiiiii@ii@@@@@@@@@@@@@@@iiiiiiiii                               \n" +
                "                              i@@@@@@@@@@@@@@@@@@@@@@@@@@ii            ii@@@@@@@@@@@@@iiiii                                  \n" +
                "                            ii@@@@@@@@@@@@@@@@@@@@@@iii                  i@@@@@@@@@@@@@@ii                                   \n" +
                "                           i@@@@@@@@@@@@@@@@@iiiii                        i@@@@@@@@@@@@@@@@                                  \n" +
                "                          iiiiii@@@@@@@@@@iii                             i@@@@@@@@@@@@@@@@i                                 \n" +
                "                         ii,,,,                                           i@@@@@@@@@@@@@@@@@                                 \n" +
                "                        ,i,,,                       i                     i@@@@@@@@@@@@@@@@@i                  ,  i,         \n" +
                "                        ,,,,          i             i@i,                  i@@@@@@@@@iiii@@i@i                ,     ,         \n" +
                "                       ,,,,         i@@             i@@@ii                ii@@@@@@,,,,,,, i@i              ,  ,    , ,       \n" +
                "                       i,,,        ,@@@i,          ii@ii                  ,@@@@@@i,,,,,,,,,ii             i   ,    i         \n" +
                "                       i,,,           iiii                 iiiiii         ,@@@@@@i,,,,,,,,,ii                 i       ,      \n" +
                "                       i,,,                           iiiiiiiii  i         @@@@@iii,,,,,,,,ii            ,      i      ii    \n" +
                "                       ,,,,                          iii iiiii   i         i@@@@@ii,,,,,,,,i             ,       i        i  \n" +
                "                        ,,,,   iiiiiiii             ii iiiiii  i i         i@@@@@iii,,,,,iii             i               ,   \n" +
                "                        i,,,,  i   iiiiiii          i iiiiiiiiiiii         i@@@@@i,,,,,i@@@           i    ,              ,i \n" +
                "                         i,,   i iiii  iiii         i  iiiiiiiiiii         i@@@@@@iii@@@@ii        i         ,             , \n" +
                "                          ,,,  iiiiiiiiiiiii        iiiiiiiiiiiiii         i@@@@@@@@@@@@@@i      i             ,        i    \n" +
                "                           ,,, iiiiiiiiiiiiii   ,                          i@@@@@@@@@@@@iii   i                 , ,,,,i      \n" +
                "                            ,,,                u,,u                        i@@@@@@@@i@@iiiii                    ,,,          \n" +
                "                            ,,,,                 i     ii                  i@@@@@@@iiiiiii,                    ,,            \n" +
                "                             i,,                     iiii                   i@@@@iiiiiiii,                    ,i             \n" +
                "                             i,,             iiiii,iiiiii                   i@iiiiiiiiii,                   ,i               \n" +
                "             ,                ,,               iiiiiiiiii                   iiiiiiiiii,,,                 ,,                 \n" +
                "     i,,i  ,   i              i,,                iiiiiiii                   ,iiiiiiiii,,                ,,,                  \n" +
                "    i      i                   i,,,                iiiiii               ,,,   iiiiiii,,,              ,i                     \n" +
                "     i      ,     i             i,,,,                iiii        ,,,,,,,,,     iiiii,,,              ,,                      \n" +
                "   ,i,,     i      i               ii,,,                  ,,,,,,,,,,,,,,,     iiiiii,,              i                        \n" +
                ",           i       ,i,,,,,,,,, ,,,iiiiiiiiiiiiiii   ,,,,,,,,,,,,,,,, ,,,   ,iiiiiii,,                                       \n" +
                ",            ,       ,                 iiiiiiiii     ,,,,,,,,,,,,,,,,,,,   ,iiiiiii,,,           i,,                         \n" +
                "   i                 ,                   iiiiiiii    ,,,,,,,,,,,,,,,,,,      iiiiiii,,,           ,,                         \n" +
                "  ,                  ,                   iiiiiiiiii ,,,,,,,,,,,,,,,,,,,      ,iiiiiiii,,         ,i                          \n" +
                "  ,   i             ,                   ,iiiiiiii   ,,,,,,,,,,,,,,, ,,,      iiiiiiiiiiii,    iiii,                          \n" +
                "     i     i      ,,                     iiiiiii    ,,,,,,,,,,,, ,,,,,      iiiiiiiiiiiiiiiiiiiiii                           \n" +
                "      iii    iiii i,                     ,iiiiii    ,,,,,,,,,,,,,,,,,,    ,iiiiiiiiiiiiiiiiiiiiii                            \n" +
                "                     i,,,,,,,,,,,,        iiiiii    ,,,,,,,,,,,,,,,,,,   iiiiiiiiiiiiiiiiiiiiiii                             \n" +
                "                             iiii,,,,,,,,,iiiiiii   ,,,,,,,,,,,,,,,,,,  iiiiiiiiiiiiiiiiiiiiiii                              \n" +
                "                                    ,i,,,,iiiiiiii  ,,,,,,,,,,,,,,,,,, iiiiiiiiiiiiiiiiiiiiiii                               \n" +
                "                                          ,iiiiiiii ,,,,,,,,,,,,,,,,,,iiiiiiiiiiiiiiiiiiiiiii                                \n" +
                "                                           iiiiiiiiii,,,,,,,,,,,,,,,,,iiiiiiiiiiiiiiiiiiiiiiiiii                             \n" +
                "                                           iiiiiiiiii,,,,,,,,,,,,,,,,,iiiiiiiiiiiiiiiiiiiiiiiiiiii,                          \n" +
                "                                            iiiiiiiiii,,,,,,,,,,,,,,,,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii                        \n" +
                "                                             iiiiiiiiii,,,,,,,,,,,,,,,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii                     \n" +
                "                                              iiiiiiiiii,,,,,,,,,,,,,,,iiiiiiiiiiiiiiiiii,,iiii,iiiiii                       \n" +
                "                                          ,iiiiiiiiiiiiii,,,,,,,,,,,iiiiiiiiiiiiiiiiiiiii,,,,,,iii,i                         \n" +
                "                                      ,iii,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii,iiiiiiiiiiiii,,,,,,,,,,i                        \n" +
                "                                  ,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii,iiiiiiiiiiiii,,,,,,,,,,i                      \n" +
                "                              ,iiiiiiiiiiiiiii,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii,,,,,,,i                     \n" +
                "                          ,iiiiiiiiiiiiiiiiiiiiii,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii,,,,,,,                   \n" +
                "                        i,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii,iiiiiiiiiiiiiiiiii,,,iiii                  \n" +
                "                       i,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii,iiiiiiiiiiiiiiiiii,iiiiiii                 \n" +
                "                       ,,iiiiiiiiiiiii,,iiiiiiii,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii,iiiiiiiii                  \n" +
                "                       ,,iiiiiiii,,,,iiiiiiiiiiii,,,,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii,,,iiiiiiiiii,i                  \n" +
                "                       i,iii,,,,,iiiiiiiiiii,i,,,iiiiiiiiiiiiiii,,,iiiiiiiiiiiiiiiiiiii,,,iiiiiiiiiiii  ,,,,                 \n" +
                "                        ,,,,,iiiiiiiiiii     ,iiiiiiiiiiiiii,,,ii,   iiiiiiiiiii,,,iiiiiiiiiiiiiii,        ,,,               \n" +
                "                       ,,,,iiiiiiiii         ,iiiiiiiiii,,             iiiiiiiiiiiiiiiiiiiiiii,,,          i ,i              \n" +
                "                       i,,,iiiii             ,,                        iiiiiiiiiiiiiiiiiii,,,,            i  ,,,             \n" +
                "                       i,,i,                 ,,i                       ,iiiiiiiiiiiii,   i,             i      ,,i           \n" +
                "                                              ,,                        iiiiii,            ,          i         ,i           \n" +
                "                       i ,  iii, iiii iiiiiii ,,i                                             i     i            ,i          \n" +
                "                         i                    ,,,                                               i i                ,i        \n" +
                "                       i  ,                    ,,i                                               ,                  i        \n" +
                "                       i                       ,,,                                               ,           ,  ,     ,      \n" +
                "                      i ii                      ,,i                                              ,        ,  ,, ,      ,     \n" +
                "                     , ,  i                      ,i                                                  ,i  ,,  i           ,   \n" +
                "                  .                               ,,                                              i   ,,i,i                , \n" +
                "                ,          i                     ,,i                                              ,                         ,\n" +
                "               ,  ,,,,,,,i,,i i,,,, ,,i, ,  ,,                                                   ,  ,  , i,i i,i, ,,  ,,   ,  ");
    }
}
