package com.xfyh.java8.inaction.appd;

import java.util.function.Function;

public class Lambda {
    Function<Object, String> f = obj -> obj.toString();
}
