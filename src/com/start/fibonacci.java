package com.start;

public class fibonacci {
    public static void main(String[] args) {
        int term,a,b,c;
        a=0;b=1;
        c=2;
        while (c<=7){
            int temp =b;
            b=b+a;
            a=temp;
            c++;


        }
        System.out.println(b);
    }
}
