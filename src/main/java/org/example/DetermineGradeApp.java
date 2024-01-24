package org.example;

import java.util.Scanner;
public class DetermineGradeApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int grade=scanner.nextInt();

        if(grade>=1 && grade<=3){
            String result="Initial";
            System.out.println(result);
        }
        else if(grade>=4 && grade<=6){
            String result="Average";
            System.out.println(result);
        }
        else if(grade>=7 && grade<=9){
            String result="Sufficient";
            System.out.println(result);
        }
        else if(grade>=10 && grade<=12){
            String result="High";
            System.out.println(result);
        }



    }
}
