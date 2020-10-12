package com.itheima.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 陆浩
 * @Date: 2020/10/10 10:54
 */
public class Test {
    public static  void test1(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
       // list.add("哈哈");
        // 跳过元素
        List<Object> collect = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(collect);
        // 过滤
        System.out.println(list.stream().filter(o -> o > 5
        ).count());
        System.out.println(list.stream().filter(integer -> integer > 5).collect(Collectors.toList()));
        // 转换
        System.out.println(list.stream().map(o -> {
            if (o > 5) {
                return o * o;
            }
            return null;
        }).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        test1();
    }
}
