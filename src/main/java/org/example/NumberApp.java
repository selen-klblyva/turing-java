package org.example;

import java.util.Scanner;
public class NumberApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        if(n>0 && m>0){
            System.out.println("1");
        }
        else if(n>0 && m<0){
            System.out.println("0");
        }
        else if(n<0 && m>0){
            System.out.println("0");
        }
        else if(n<0 && m<0){
            System.out.println("1");
        }


    }
}
