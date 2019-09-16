package c.c.k.biz;

import c.c.k.http.UserService;
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
public class OrderService {
    @Resource
    private UserService userService;
    @Resource
    OrderMapper orderMapper;

    @Transactional
    public void addOrder(int moneyId){
        Order order = new Order("order-01, moneyid:" + moneyId);
        order.setId(new Random(System.currentTimeMillis()).nextInt());
        System.out.println(order.getId());
        if(order.getId()<0)
            throw new IllegalStateException("addOrder exception");
        orderMapper.insert(order);

        userService.addUser(moneyId, order.getId());
    }
}
