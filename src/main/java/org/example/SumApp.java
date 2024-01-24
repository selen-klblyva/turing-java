package org.example;

import java.util.Scanner;
public class SumApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int sum;
        if (number >= 1000 && number <= 9999) {

            int firstDigit = number / 1000;


            int lastDigit = number % 10;


            sum = firstDigit + lastDigit;


            System.out.println(sum);
        }

    }
}
