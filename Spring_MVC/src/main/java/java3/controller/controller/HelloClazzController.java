package java3.controller.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloClazzController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView printMessage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("message","Hello Java Clazz!");
        return mv;
    }

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public ModelAndView welcome(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("clazz");
        mv.addObject("name","Hoa");
        return mv;
    }

    @RequestMapping(value = "site", method = RequestMethod.GET)
    public String redirect(){
        return "redirect:https://www.google.com/";
    }

    @RequestMapping(value = "data", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody String raw(){
        return "Xin chao moi nguoi";
    }

    @RequestMapping(value = "hello2" ,method = RequestMethod.POST)
    public ModelAndView printMessage2(@RequestParam(value = "data", required = false) String message){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form");
        mv.addObject("message",message);
        return mv;
    }
}
