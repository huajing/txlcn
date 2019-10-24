package c.c.k.money;

import c.c.k.http.OrderService;
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
public class MoneyService {
    @Resource
    private OrderService orderService;
    @Resource
    private MoneyMapper moneyMapper;

    @LcnTransaction
    public void addMoney(){
        Money money = new Money(123123);
        int moneyId = Math.abs(new Random(System.currentTimeMillis()).nextInt());
        money.setId(moneyId);
        System.out.println(money.getId());
        moneyMapper.insert(money);

        orderService.addOrder(moneyId);
        if(new Random(System.currentTimeMillis()).nextInt()<0)
            throw new IllegalStateException("mopney exception");
    }
}
