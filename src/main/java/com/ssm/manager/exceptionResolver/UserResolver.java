package com.ssm.manager.exceptionResolver;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/27/0027 20:50
 * @Author: shicheng
 * @Description:
 */

import com.ssm.manager.exception.UserException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User异常处理类，用于处理异常
 */
public class UserResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println("进入异常处理方法");
        //获取异常对象
        UserException userException = null;
        //判断形参异常是否是自定义的异常
        if(e instanceof UserException){
            //强转为自定义异常
            userException = (UserException) e;
        }else{
            //如果不是，则创建新自定义异常
            userException = new UserException("服务器数据异常");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",userException.getName());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
