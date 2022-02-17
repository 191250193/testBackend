package CCTP.Controller;


import CCTP.Entity.TestForBuild;
import CCTP.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/")
    public String index(){
        return "test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<TestForBuild> findByUserAge() {
        System.out.println("查询所有数据:");
        return testService.findAll();
    }
}
