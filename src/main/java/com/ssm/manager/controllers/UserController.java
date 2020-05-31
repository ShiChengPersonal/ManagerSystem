package com.ssm.manager.controllers;

import com.ssm.manager.domain.User;
import com.ssm.manager.exception.UserException;
import com.ssm.manager.services.IUserService;
import com.ssm.manager.springAOP.UserAop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:53
 * @Author: shicheng
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private UserAop userAop;


    @RequestMapping(value = "/findOne" ,method = RequestMethod.POST)
    public ModelAndView findOne(User user, ModelAndView modelAndView){
        User userfind = iUserService.findOne(user);
        modelAndView.addObject("user",userfind);
        modelAndView.setViewName("showUser");

        System.out.println("useraop对象"+userAop);
        return modelAndView;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ModelAndView addUser(User user,ModelAndView modelAndView){
        //先判断条件是否满足，是否有姓名、性别、联系电话三个部位null信息
        System.out.println(user.getU_name());
        System.out.println(user.getU_gender());
        System.out.println(user.getU_phone());
        if (user.getU_name().equals("")  || user.getU_gender().equals("")  || user.getU_phone().equals("") ){
            try {
                System.out.println("controller抛出异常：条件缺少");
                //当条件缺少时，上抛自定义异常
                throw new UserException("条件缺少");
            } catch (UserException e) {
                e.printStackTrace();
            }
        }

        iUserService.addUser(user);
        String u_id = user.getU_id().toString();
        if (u_id != ""){
            User userfind = new User();
            userfind.setU_id(Integer.valueOf(u_id));
            User result = iUserService.findOne(userfind);
            modelAndView.addObject("user",result);
            modelAndView.addObject("msg","添加成功");
        }else{
            modelAndView.addObject("meg","添加失败");
        }
        modelAndView.setViewName("showAddUser");
        return modelAndView;
    }

    @RequestMapping(value = "/ajax",method = RequestMethod.POST)
    public @ResponseBody User ajax(@RequestBody User user){
        //RequestBody自动把json数据封装到User对象中
        //ResponseBody自动把user对象转换为json用于返回
        System.out.println("进入ajax方法");
        System.out.println("接收到的数据:"+user);
        User userFind =iUserService.findOne(user);
        //响应,直接返回user对象
        return userFind;

    }
}
