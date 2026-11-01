package com.example;

import java.io.File;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        String classesDir = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String baseDoc = new File(classesDir).toPath().resolve("../../src/main/webapp").normalize().toString();
        tomcat.addWebapp("", baseDoc);

        tomcat.start();
        System.out.println("Tomcat started on http://localhost:8080");
        tomcat.getServer().await();
    }
}
