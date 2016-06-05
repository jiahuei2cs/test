package junitTest;

import dao.UserMapper;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by wanghui on 16/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback(true)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MyTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void add() {
        User user = new User();
        user.setId(200);
        user.setName("wanghui");
        userMapper.save(user);
    }

}

