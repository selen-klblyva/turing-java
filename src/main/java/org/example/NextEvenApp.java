package org.example;

import java.util.Scanner;
public class NextEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        if(n%2==0){
            int num=n+2;
            System.out.println(num);
        }
        else{
            int num=n+1;
            System.out.println(num);
        }




    }
}