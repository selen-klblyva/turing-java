package org.example;

import java.util.Scanner;
public class ConditionalApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);


        int x=scanner.nextInt();
        if(x<-4 && x>=-100){
            int y=x+5;
            System.out.println(y);
        }
        else if(x>=-4 && x<=7){
            int y=(int)Math.pow(x,2)-3*x;
            System.out.println(y);
        }
        else if(x>7 && x<=100){
            int y=(int)Math.pow(x,3)+2*x;
            System.out.println(y);
        }


    }
}
