package com.start;
import  java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans =0;
        while (true){
        System.out.print("enter the operators:");
        char op = sc.next().trim().charAt(0);
        if(op=='+' ||  op=='/' ||op=='*' ||op=='-'){
            int a= sc.nextInt();
            int b= sc.nextInt();

            if(op=='+'){
                System.out.println(a+b);

            }

            if(op=='/'){
                System.out.println(a/b);

            }

            if(op=='*'){
                System.out.println(a*b);

            }

            if(op=='-') {
                System.out.println(a - b);

            }
            else {
                System.out.println("invalid number");
            }

        }
            System.out.println(ans);


        }
    }
}
