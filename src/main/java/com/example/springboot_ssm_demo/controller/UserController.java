/**
 * FileName: UserController
 * Author:   57347
 * Date:     2020/8/10 16:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 邵尉               8/10            1.0                测试
 */
package com.example.springboot_ssm_demo.controller;

import com.example.springboot_ssm_demo.dao.UserMapper;
import com.example.springboot_ssm_demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈对象控制〉<br>
 * 〈〉
 *
 * @author 57347
 * @create 2020/8/10
 * @since 1.0.0
 */
@RestController
public class UserController {
    //依赖注入
    @Autowired//它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法。
    UserMapper userMapper;

    @RequestMapping(value = "cs")//处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
    public User cs(){
        User user = userMapper.selectUserByName("test1");
        return user;
    }
}
