package com.example;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.example.config.WebConfig;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello world!");

        //Tomcat Boiler plate
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        String contextPath ="";
        String baseDoc = new File(System.getProperty("java.io.tmpdir")).getAbsolutePath();

        Context context = tomcat.addContext(contextPath, baseDoc);

        //IOC container
        AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
        springContext.register(WebConfig.class);

        //Dispatcher Servlet

        DispatcherServlet dispatcherServlet = new DispatcherServlet(springContext);

        tomcat.addServlet(contextPath, "dispatcherServlet", dispatcherServlet);
        context.addServletMapping("/","dispatcherServlet");

        tomcat.start();

        System.out.println("Tomcat started on port : 8080");

        tomcat.getServer().await();
        
        
    }
}