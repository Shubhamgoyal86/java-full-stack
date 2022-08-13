package com.start;

import java.util.Arrays;

public class Arrayf {
    public static void main(String[] args) {


        int[] arr= {10,20,30,40,50};

        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int nums[]){
        nums[4] = 45;
    }

}
