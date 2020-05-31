package com.ssm.manager.springAOP;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/27/0027 22:04
 * @Author: shicheng
 * @Description:
 */

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 关于UserDao的通知类，只针对于UserDao
 */
public class UserAop {

    /**
     * 前置通知
     */
    public void before(){
        System.out.println("前置通知执行了。。。");
    }

    /**
     * 后置通知
     */
    public void afterReturning(){
        System.out.println("后置通知执行了。。。");

    }

    /**
     * 异常通知
     */
    public void afterThrowing(){
        System.out.println("异常通知执行了。。。");

    }

    /**
     * 最终通知
     */
    public void after(){
        System.out.println("最终通知执行了。。。");

    }

    /**
     * 环绕通知
     * ProceedingJoinPoint接口，该接口有一个 processd 方法，此方法就相当于明确调用切入点方法
     *                     该接口可以作为环绕通知的方法参数，在程序执行时，spring框架会提供该接口的实现类供调用
     */
    public void around(ProceedingJoinPoint pjp){
        Object rtValue = null;  //可以接收切入点方法的返回值
        try{
            Object[] obj = pjp.getArgs();   //得到方法执行所需参数
            //添加增强方法1       前置通知
            System.out.println("环绕通知中的前置通知执行了。。。");
            rtValue = pjp.proceed(obj);  //明确调用业务层切入点方法
            //添加增强方法2       后置通知
            System.out.println("环绕通知中的后置通知执行了。。。");
        }catch( Throwable t){//只能使用Throwable异常
            //添加增强方法3       异常通知
            System.out.println("环绕通知中的异常通知执行了。。。");
        }finally{
            //添加增强方法4       最终通知
            System.out.println("环绕通知中的最终通知执行了。。。");
        }
    }
}
