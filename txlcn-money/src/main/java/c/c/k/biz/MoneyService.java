package c.c.k.biz;

import c.c.k.http.OrderService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
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
public class MoneyService {
    @Resource
    private OrderService orderService;
    @Resource
    private MoneyMapper moneyMapper;

    @LcnTransaction
    @Transactional
    public void addMoney(){
        Money money = new Money(123123);
        int moneyId = Math.abs(new Random(System.currentTimeMillis()).nextInt());
        money.setId(moneyId);
        System.out.println(money.getId());
        moneyMapper.insert(money);

        orderService.addOrder(moneyId);
    }
}
