package c.c.k.http;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title c.c.k.http
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/9/16 chenck
 */
@FeignClient(name = "TXLCN-USER")
public interface UserService {
    @GetMapping("/addUser")
    String addUser(@RequestParam("moneyId") int moneyId, @RequestParam("orderId") int orderId);
}
