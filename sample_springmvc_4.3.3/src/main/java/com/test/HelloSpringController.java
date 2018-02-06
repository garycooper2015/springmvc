package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpringController {
    String message = "Welcome to Spring MVC!";
 
    @RequestMapping("/hello")
    public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "Spring") String name) {
 
        ModelAndView mv = new ModelAndView("hellospring");//指定视图
 
        /*
         * 比如这是业务层，得到业务的数据
         */
        mv.addObject("name", name);
        mv.addObject("message",message);
        
        /*
         * 实现把集合数据传递到页面上
         */
        List<String> list1 = new ArrayList<String>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        
        mv.addObject("list1", list1);
        
        //整数
        int i = 1;
        mv.addObject("int1", i);
        
        //浮点数
        float f = 3.45f;
        mv.addObject("float1",f);
        
        
        
        return mv;
    }
}	
