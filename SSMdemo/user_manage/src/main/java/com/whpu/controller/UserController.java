package com.whpu.controller;

import com.whpu.plugins.MessageTemplate;
import com.whpu.pojo.ResponseData;
import com.whpu.pojo.UserDto;
import com.whpu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * @author liusr
 * @create 2022-04-27
 * @package com.whpu.controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private MessageTemplate messageTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResponseData login(@RequestBody UserDto userDto,HttpSession session){

        //获取参数
        String phone = userDto.getPhone();
        String userCode = userDto.getCode();
        String serverCode = (String) session.getAttribute("serverCode");

        //比较验证码
        if (!(serverCode!=null&&serverCode.equals(userCode))){
            //验证码不通过
            return ResponseData.responseError("验证码错误");
        }

        //验证码通过
        userService.registerUser(phone);
        return ResponseData.responseOk("注册成功");
    }
    @RequestMapping("/sendMessage")
    public ResponseData sendMessage(@RequestBody UserDto userDto, HttpSession session){

        //发送短信
        String phone = userDto.getPhone();

        //随机产生四位验证码
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            code+=random.nextInt(10);
        }

        //将服务器生成的代码存放到session中
        session.setAttribute("serverCode",code);
        try {
            messageTemplate.sendMessage(phone,code);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("手机号："+phone+"验证码："+code);
        return ResponseData.responseOk("发送成功！");
    }
}
