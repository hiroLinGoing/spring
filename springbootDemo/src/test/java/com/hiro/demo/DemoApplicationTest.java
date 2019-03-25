package com.hiro.demo;

import com.hiro.demo.db.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Project: springbootDemo
 *
 * @author : hirolin
 * @date : 2019/3/25 22:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void Test(){
        System.out.printf(userMapper.getUser(1).getName());
    }

}
