package com.start;

import java.util.Arrays;

public class fun {
    public static void main(String[] args) {

        gji(20,"Shubham",53);
    }
    static void  gji(int a,String b,int ...v){
        System.out.println(Arrays.toString(v));
    }
}
