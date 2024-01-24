package org.example;

import java.util.Scanner;
public class Divisible2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        if (n%b==0 && n%a==0) {
            System.out.println("YES");
        } else{
            System.out.printf("NO");

        }

    }
}