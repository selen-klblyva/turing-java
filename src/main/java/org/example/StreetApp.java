package org.example;

import java.util.Scanner;
public class StreetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if(n%2==0 && m%2==0){
            System.out.println("1");
        }
        else if(n%2!=0 && m%2!=0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
