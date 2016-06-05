package service;

import dao.UserMapper;
import model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by wanghui on 16/6/4.
 */
@Controller
@RequestMapping("/userManager")
public class UserManager {

    private static Logger logger = Logger.getLogger(UserManager.class);
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/save.do")
    @Transactional
    public @ResponseBody
    void save(User user) {
        logger.info("start");
        User u = new User();
        u.setId(100);
        u.setName("wanghui");
        userMapper.save(u);
        userMapper.save(user);
        logger.info("end");
    }
}
