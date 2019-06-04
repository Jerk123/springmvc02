package net.wanho;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Jerk on 2019/6/3.
 */
@Controller
public class JsonController {

    /**
     * ResponseBody并不是直接把对象转成json串，把结果放到Response体中返回
     *
     * @return
     */
    @RequestMapping("responseJson")
    @ResponseBody
    public  Student responseJson() {
        Student s=new Student();
        s.setName("张三");
        return s;
    }


    @RequestMapping("responseJsonResult")
    @ResponseBody
    public JsonResult responseJsonResult() {
        Student s=new Student();
        s.setName("张三");
        JsonResult jsonResult=new JsonResult(200,"访问成功",s);
        return jsonResult;
    }



    /*@RequestMapping("getJson")
    @ResponseBody
    public JsonResult getJson(Student student) {

        JsonResult jsonResult=new JsonResult(200,"访问成功",student);
        return jsonResult;
    }*/

    @RequestMapping("getJson")
    @ResponseBody
    public JsonResult getJson(@RequestBody List<Student> students) {

        JsonResult jsonResult=new JsonResult(200,"访问成功",students);
        return jsonResult;
    }
}
