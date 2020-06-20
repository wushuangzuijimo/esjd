package com.wushuang.wushuangesjd.util;

import java.util.Arrays;

public class App {


    public static void main(String[] args) {



        int []arr={211,3,3,45,0};
        long beginTime = System.currentTimeMillis();
        int max = Arrays.stream(arr).max().getAsInt();
        long endTime = System.currentTimeMillis();


        System.out.println(max);

        System.out.println("spend"+(endTime - beginTime)+"ms");
    }
}
