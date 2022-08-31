package edu.hanoi.jazz.controller;

import freemarker.core.ReturnInstruction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message","Hello Jazz Clazz");
        return mv;
    }

    @RequestMapping("/nguoi-dung")
    ModelAndView User(){
        ModelAndView model = new ModelAndView();
        model.addObject("messager","thiss is peotected page");

        model.setViewName("index");
        return model;
    }

    @RequestMapping("/dang-nhap")
    ModelAndView login(@RequestParam(value = "error",required = false)String error){
       ModelAndView mv = new ModelAndView("login");
       if (error != null) mv.addObject("error",error);
       return mv;
    }
}
