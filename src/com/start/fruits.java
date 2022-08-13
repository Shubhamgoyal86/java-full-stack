package com.start;

import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fal = sc.nextLine();
        switch (fal) {
            case "Mango" -> System.out.println("capital");
            case "allple" -> System.out.println("means apple");
            default -> System.out.println("pease add another fruits" +
                    "");
        }
    }
}
