package org.example;

import java.util.Scanner;
public class ProductApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        int product=1;
        while(number>0){
            int remainder=number%10;
            product*=remainder;
            number/=10;
        }
        System.out.println(product);
    }
}