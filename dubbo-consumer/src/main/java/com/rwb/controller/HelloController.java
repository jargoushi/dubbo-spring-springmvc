package com.rwb.controller;

import com.rwb.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Version 1.0
 * @Author:ruwb
 * @Date:2019/10/9
 * @Content:
 */
@Controller
public class HelloController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/hello")
    @ResponseBody
    public String showHello() {

        String retVal = demoService.sayHello("张三");
        return retVal;
    }
}
