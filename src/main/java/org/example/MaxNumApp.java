package org.example;

import java.util.Scanner;
public class MaxNumApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int max_num;
        int min_num;
        if(a>b){
            max_num=a;
            min_num=b;
        }
        else{
            max_num=b;
            min_num=a;
        }

        System.out.printf("%d %d",min_num,max_num);
    }
}
