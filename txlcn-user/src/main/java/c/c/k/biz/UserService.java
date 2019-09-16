package c.c.k.biz;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @Title c.c.k.biz
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/9/16 chenck
 */
@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    @Transactional
    void addUser(int moneyId, int orderId){
        User user = new User("abc moneyId:" + moneyId + ",orderId:" + orderId);
        user.setId(new Random(System.currentTimeMillis()).nextInt());
        if(user.getId()<0)
            throw new IllegalStateException("addUser exception");
        userMapper.insert(user);
    }
}
