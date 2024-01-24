package org.example;

import java.util.Scanner;
public class DivisibleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a= scanner.nextInt();
        int b= scanner.nextInt();

        if (a%b==0) {
            System.out.println("Divisible");
        } else if (a%b!=0) {
            System.out.printf("%d %d",a/b,a%b);

        }

    }
}