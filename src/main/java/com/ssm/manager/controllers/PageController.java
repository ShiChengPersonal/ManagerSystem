package com.ssm.manager.controllers;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/27/0027 15:16
 * @Author: shicheng
 * @Description:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 负责页面的跳转
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toAdd")
    public ModelAndView toAdd(ModelAndView modelAndView){
        modelAndView.setViewName("add");
        return modelAndView;
    }
    @RequestMapping("toFind")
    public ModelAndView toFind(ModelAndView modelAndView){
        modelAndView.setViewName("find");
        return modelAndView;
    }
}
