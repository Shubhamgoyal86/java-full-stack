package com.start;

import java.util.Arrays;

public class arraysfunctions {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 4, 6, 5, 6};
        change(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void change(int nums[]){
        nums[0] = 56;
    }
}
