package net.wanho;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jerk on 2019/6/3.
 */
@Controller
//@RequestMapping("hello")
public class HelloController {


    @RequestMapping("hello/{id}")
    public String hello(@RequestParam String name, @PathVariable Integer id){

        return "hello";
    }



}
