package c.c.k.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Resource
    UserService userService;


    @RequestMapping("/txlcn")
    public String execute(
            @RequestParam("value") String value,
            @RequestParam(value = "ex", required = false) String exFlag) {
        return "";
//        return demoService.execute(value, exFlag);
    }

    @GetMapping("/addUser")
    public String getUser(int moneyId, int orderId){
        userService.addUser();
        return "ok";
    }
}
