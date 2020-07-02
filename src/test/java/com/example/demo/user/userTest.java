package com.example.demo.user;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class userTest {

    @Autowired
    UserDao userDao;

    @Test
    public void test01() {
        List<User> name = userDao.findByName("张三丰");
        System.out.println(name);
    }
}
