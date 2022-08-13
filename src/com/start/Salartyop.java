package com.start;
import java.util.Scanner;
public class Salartyop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("write your salary:");
        int tk= sc.nextInt();
        if(tk>=10000){
            System.out.println(tk=tk+2000);
        }
        else {
            System.out.println(tk=tk+1000);
        }
    }
}
