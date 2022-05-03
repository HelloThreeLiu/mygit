package com.itlsr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liusr
 * @create 2022-04-07
 * @package com.itlsr.controller
 */
@Controller
public class UserController {

    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("Controller save running...");
        return "success";
    }
}
