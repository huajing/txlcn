package c.c.k.user;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.stereotype.Service;

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

    @LcnTransaction
    void addUser(){
        User user = new User("abc moneyId:" + 1 + ",orderId:" + 1);
        user.setId(new Random(System.currentTimeMillis()).nextInt());
//        if(user.getId()<0)
//            throw new IllegalStateException("addUser exception");
        userMapper.insert(user);
    }
}
