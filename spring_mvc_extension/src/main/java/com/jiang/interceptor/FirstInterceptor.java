package com.jiang.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jiangronghua
 *
 * preHandle(): 在控制器方法执行之前执行，其返回值标识对控制器方法对拦截（false）或放行（true）
 * postHandle(): 在控制器方法执行之后执行
 * afterCompletion(): 在控制器方法执行之后，且渲染视图完毕之后执行
 *
 * 多个拦截器对执行顺序和在SpringMVC对配置文件中配置对顺序有关
 * preHandle()按照配置对属性执行，而postHandle()和afterCompletion()按配置对反序执行
 */
@Component
public class FirstInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FirstInterceptor -----> preHandle");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("FirstInterceptor -----> postHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("FirstInterceptor -----> afterCompletion");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
