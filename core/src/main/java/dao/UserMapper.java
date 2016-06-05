package dao;

import model.User;
import org.springframework.stereotype.Component;


/**
 * Created by wanghui on 16/6/4.
 */
@Component
public interface UserMapper {

    void save(User user);

}
