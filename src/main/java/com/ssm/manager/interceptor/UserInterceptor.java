package com.ssm.manager.interceptor;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/27/0027 21:03
 * @Author: shicheng
 * @Description: 多个拦截器中方法执行顺序类似于栈，先进先出
 *                   1、按照拦截器的配置顺序执行 预处理方法，
 *                   2、执行controller
 *                   3、按照拦截器配置顺序的 倒序 执行 后处理方法
 *                   4、执行页面跳转
 *                   5、按照拦截器配置顺序的 倒序 执行 最后处理方法
 *      登录页面本身（包括POST请求）不能应用Interceptor来拦截，否则会陷入无限循环
 */

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User实体类控制器的拦截器
 */
public class UserInterceptor implements HandlerInterceptor {
    /**
     * 预处理方法，controller执行前先执行此方法，一般用于验证
     * @param request
     * @param response
     * @param handler
     * @return 值为 true，放行，执行下一个拦截器，如果没有就执行controller方法
     *         值为false，不放行，就可以使用request或者response跳转到页面，并提示信息
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        System.out.println("拦截器中的预处理方法执行了。。。");
        return true;
    }

    /**
     * 后处理方法，执行controller代码内容之后，controller跳转的页面执行之前，再执行此方法，
     *           如：controller跳转到success.jsp，在这个jsp页面执行之前，执行此处理方法
     *           如果这个方法有页面跳转，那么就不会再执行controller的页面跳转，而是执行这个方法的跳转
     * @param request
     * @param response
     * @param handler
     * @param modelandview
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelandview)throws Exception{
        System.out.println("拦截器中的后处理方法执行了。。。");
    }

    /**
     * 最后处理方法，在controller跳转的页面执行完之后，再执行这个方法,
     *             如controller跳转到success.jsp，在这个jsp页面执行之后，执行此处理方法
     *             由于页面跳转已经完成，因此这个方法不能再跳转页面
     *             一般用于释放资源
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception{
        System.out.println("拦截器中的最后处理方法执行了。。。");
    }
}
