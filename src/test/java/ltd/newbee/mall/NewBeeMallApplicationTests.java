package ltd.newbee.mall;

import ltd.newbee.mall.dao.MallUserMapper;
import ltd.newbee.mall.entity.MallUser;
import ltd.newbee.mall.service.NewBeeMallUserService;
import ltd.newbee.mall.util.MD5Util;
import org.apache.catalina.session.StandardManager;
import org.apache.catalina.session.StandardSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
@SpringBootTest
class NewBeeMallApplicationTests {
    @Autowired
    private MallUserMapper mallUserMapper;
    @Autowired
    private NewBeeMallUserService newBeeMallUserService;

    @Test
    void testDao(){
        MallUser mallUser = mallUserMapper.selectByLoginNameAndPasswd("", MD5Util.MD5Encode("", "UTF-8"));
        System.out.println(mallUser);
    }

    @Test
    void testService(){
        String resp = newBeeMallUserService.login("", MD5Util.MD5Encode("", "UTF-8"), new StandardSession(new StandardManager()));
        System.out.println(resp);
    }

    /**
     * 这个只能在postman、eolink、前端测试（按F12查看network测试，不然测不了）
     */
    @Test
    void testController(){

    }
}
