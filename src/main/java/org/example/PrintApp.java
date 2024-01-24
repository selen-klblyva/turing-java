package org.example;

import java.util.Scanner;
public class PrintApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int r2,r1;
        r1=a%10;
        r2=a/10;


        System.out.println(r2);
        System.out.println(r1);

    }
}