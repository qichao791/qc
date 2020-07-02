package com.example.demo.user;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import com.example.demo.domain.UserMongo;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class abc {
    private static final Log log = LogFactory.getLog(abc.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void contextLoads() {
        UserMongo user = new UserMongo();
        user.setId("1000000000000000");
        user.setUserName("凌康");
        user.setDepartId("dep02");
        mongoTemplate.insert(user);
        log.info(user.getUserName()+"插入成功！");

        UserMongo user1 = new UserMongo();
        user1.setId("2999999999999999");
        user1.setUserName("祁超");
        user1.setDepartId("dep02");
        mongoTemplate.insert(user1);
        log.info(user1.getUserName()+"插入成功！");

        //user1 = new User();
        user1.setId("888888888888888888");
        user1.setUserName("张汇泉");
        user1.setDepartId("dep01");
        mongoTemplate.insert(user1);
        log.info(user1.getUserName()+"插入成功！");

        delete();

    }

    @Test
    public void find() throws Exception {
        UserMongo user=new UserMongo();
        List<UserMongo> users=mongoTemplate.findAll(UserMongo.class);
        users.forEach(u -> {
            log.info(u.toString());
        });
    }

    @Test
    public void update(){
        mongoTemplate.updateFirst(query(where("userName").is("凌康")), Update.update("UserName","我是凌康"),UserMongo.class);
    }

    @Test
    public void delete(){
        UserMongo user=new UserMongo();
        user.setId("2999999999999999");
        mongoTemplate.remove(user);
    }


}
