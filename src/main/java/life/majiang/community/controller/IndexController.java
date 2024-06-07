package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//@Controller定义一个控制器类
@Controller
public class IndexController {
    //@GetMapping用于处理请求方法的GET类型
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
