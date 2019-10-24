package c.c.k.order;

import c.c.k.http.UserService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
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
public class OrderService {
    @Resource
    private UserService userService;
    @Resource
    OrderMapper orderMapper;
//    @TxcTransaction(propagation = DTXPropagation.SUPPORTS)
//    @LcnTransaction
    @TxcTransaction
    public void addOrder(int moneyId){
        Order order = new Order("order-01, moneyid:" + moneyId);
        order.setId(new Random(System.currentTimeMillis()).nextInt());
        System.out.println(order.getId());
        orderMapper.insert(order);
//        if(order.getId()<0)
//            throw new IllegalStateException("addOrder exception");
//        userService.addUser(moneyId, order.getId());
    }
}
