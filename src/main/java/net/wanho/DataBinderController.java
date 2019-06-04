package net.wanho;



import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by Jerk on 2019/6/3.
 */
@Controller
public class DataBinderController {

//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder) {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
////        注册自定义的转换器
//        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
//    }


    @RequestMapping("testDate")
    public String redirect(Date date, Map map) {
        System.out.println(date);
        map.put("msg", date);
        return "hello";
    }

    @RequestMapping("testDate2")
    public String redirect(Student student) {
        System.out.println(student.getDate()+"========="+student.getPercent());
        return "hello";
    }
}
