package ltd.newbee.mall;

import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
@SpringBootTest
class NewBeeMallApplicationTests {

    @Test
//    @Scheduled(cron = "0/30 * * * * ?")
    void testPost(){
        // url
        String url="http://localhost:28089/login";

        // 造json对象
        JSONObject body = new JSONObject();
        body.put("account","");
        body.put("password","");

        // ......

        // 打印信息
        System.out.println("hello");
    }

}
