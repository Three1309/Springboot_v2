package com.fc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * 项目启动方法
 * @author Administrator
 *
 */
@SpringBootApplication
@MapperScan(value = "com.fc.test.mapper")
public class SpringbootSwagger2Application /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootSwagger2Application.class, args);
        System.out.println("=================================");
        System.out.println("=============启动成功===============");
        System.out.println("=================================");
    }

    /*@Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }*/

}
