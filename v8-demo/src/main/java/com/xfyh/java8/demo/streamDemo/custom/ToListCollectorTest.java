package com.xfyh.java8.demo.streamDemo.custom;

import com.xfyh.java8.demo.streamDemo.Menu;
import com.xfyh.java8.demo.streamDemo.MyDish;

import java.util.List;

public class ToListCollectorTest {
    public static void main(String[] args) {
        final List<MyDish> collect = Menu.menu.stream()
                .collect(new ToListCollector<MyDish>());
        System.out.println(collect);
    }
}
