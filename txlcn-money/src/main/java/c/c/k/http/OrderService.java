package c.c.k.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title c.c.k.biz
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/9/16 chenck
 */
@FeignClient(name = "txlcn-order")
public interface OrderService {
    @GetMapping("/addOrder")
    public String addOrder(@RequestParam("moneyId") int moneyId);
}
