package org.example;
import java.util.Scanner;
public class Finding1App {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);


        int x=scanner.nextInt();
        if(x>=5 && x<=1000){
            int y=x+7;
            System.out.println(y);
        }
        else if(x<5 && x>=-1000){
            int y=(int)Math.pow(x,2)-3*x+4;
            System.out.println(y);
        }

    }
}