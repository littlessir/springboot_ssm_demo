package com.example.springboot_ssm_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableTransactionManagement//开启事务支持后，然后在访问数据库的Service方法上添加注解 @Transactional 便可。
@MapperScan("com.example.springboot_ssm_demo.dao")
public class SpringbootSsmDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootSsmDemoApplication.class, args);
    }

}
