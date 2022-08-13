package com.start;
import  java.util.Scanner;
public class loops {
    public static void main(String[] args) {
//        for(int i=1;i<10;i++){
//            System.out.println("hello world");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for(int i = 1;i<=num;i++){
//            System.out.print(" "+i);
//        }
//
//        int i =1;
//        while(i<=14){
//            i++;
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("enter three numbers");
        int max =a;
        if (b>max){
            System.out.println("b is grsater");
        }
        else if (c>max){
            System.out.println("c is grsater");
        }
        else {
            System.out.println("A is gratyer");
        }
    }
    }

