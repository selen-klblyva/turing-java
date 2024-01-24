package org.example;

import java.util.Scanner;
public class OneIntegerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >=0 && n <= 9) {
            System.out.println("Ok");
        } else if (n<=0 && n >= -9) {
            System.out.println("Ok");
        } else if (n > 9) {
            System.out.println("No");
        } else if (n < -9) {
            System.out.println("No");

    }
}}