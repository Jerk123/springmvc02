package net.wanho;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Jerk on 2019/6/3.
 */

@Controller
public class ModelController {

    @RequestMapping("modelAndView")
    public ModelAndView test(ModelAndView modelAndView) {
        modelAndView.addObject("msg", "modelAndView");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping("model")
    public String test(Model model) {
        model.addAttribute("msg", "hello");
        return "hello";
    }

    @RequestMapping("map")
    public String map(Map map) {
        map.put("msg", "map");
        return "hello";
    }


    @RequestMapping("redirect")
    public String redirect(Map map) {
        map.put("msg", "map");
        return "redirect:/modelAndView";
    }
}
