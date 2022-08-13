package com.start;

public class stringfunction {
    public static void main(String[] args) {

        String asns= greeting("Shubham Goyal");
        System.out.println(
                asns
        );
    }
    static String greeting( String name){
        String message = "My Name is " + name;

        return  message;

    }
}
