package org.example;

import java.util.Scanner;
public class Finding2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int r1=x%10;
        int r2=x/100;


        if(r1>r2){
            int max_num=r1;
            System.out.print(max_num);
        }
        else if(r2>r1){
            int max_num=r2;
            System.out.print(max_num);
        }
        else{
            System.out.print("=");
        }

    }
}
