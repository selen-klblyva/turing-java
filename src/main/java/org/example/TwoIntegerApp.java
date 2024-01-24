package org.example;

import java.util.Scanner;
public class TwoIntegerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >=10 && n <=99) {
            System.out.println("Ok");
        } else if (n>=-99 && n <= -10) {
            System.out.println("Ok");
        } else if (n<10 && n>-10) {
            System.out.println("No");
        }
        else if(n<-99){
            System.out.println("No");
        }
        else if(n>99){
            System.out.println("No");
        }
    }}
