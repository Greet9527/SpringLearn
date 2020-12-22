package org.grit.webMvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * SpringMvc 遵循Servlet的SPI标准。实现了javax.servlet.ServletContainerInitializer
 *通过HandleTypes注解将WebApplicationInitializer所有子类加载到Servlet容器初始化器中跟随容器初始化而初始化
 * */
public class GritWebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        //TODO Servlet容器初始化时的一些 操作。比如初始化Spring容器并注入bean

        //加载spring web配置
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MvcAppCfg.class);
        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }


}
