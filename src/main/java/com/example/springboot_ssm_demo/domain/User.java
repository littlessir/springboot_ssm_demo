/**
 * FileName: User
 * Author:   57347
 * Date:     2020/8/10 15:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springboot_ssm_demo.domain;

/**
 * 〈接收对象〉<br>
 * 〈〉
 *
 * @author 57347
 * @create 2020/8/10
 * @since 1.0.0
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private String telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    @Override
    public String toString(){
        return "测试用户{" +
                "id=" + id +
                ",姓名=" + name +

                ",年龄=" + age +
                ",电话=" + telephone +
                '}';
    }
}
