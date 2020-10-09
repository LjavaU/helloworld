package com.itheima.domain;

/**
 * @Author: 陆浩
 * @Date: 2020/10/9 20:24
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setAddress("河南");
        user.setName("张三");
        System.out.println(user);
    }
}
