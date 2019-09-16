package c.c.k.biz;

import c.c.k.http.OrderService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;


@RestController
public class DemoController {
    @Resource
    private MoneyService moneyService;


    @RequestMapping("/txlcn")
    public String execute(
            @RequestParam("value") String value,
            @RequestParam(value = "ex", required = false) String exFlag) {
        return "";
//        return demoService.execute(value, exFlag);
    }

    @GetMapping("/addMoney")
    public String money(){
        moneyService.addMoney();


        return "ok";
    }
}
