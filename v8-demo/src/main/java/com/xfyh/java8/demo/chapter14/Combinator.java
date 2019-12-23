package com.xfyh.java8.demo.chapter14;

import java.util.function.Function;

/**
 * 结合器是一种函数式的思想，它指的是将两个或多个函数或者数据结构进行合并
 */
public class Combinator {
    public static void main(String[] args) {
        System.out.println(repeat(3, (Integer x)->2 * x).apply(10));
    }

    static <A> Function<A, A> repeat(int n, Function<A, A> f) {
        return n == 0 ? x -> x : compose(f, repeat(n - 1, f));
    }

    static <A, B, C> Function<A, C> compose(Function<B, C> g, Function<A, B> f) {
        return x -> g.apply(f.apply(x));
    }
}
