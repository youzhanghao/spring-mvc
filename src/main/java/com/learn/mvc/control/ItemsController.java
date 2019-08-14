package com.learn.mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author youzhanghao [m13732916591_1@163.com]
 * @Description:
 * @Date 2019/8/11
 */
@Controller
@RequestMapping("/queryItems")
public class ItemsController {

    @RequestMapping("/say")
    public String say(Model model) {
        model.addAttribute("name","porschan");
        return "items/itemsList";
    }

}
