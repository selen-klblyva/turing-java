package az.edu.turing;

import java.util.Scanner;
public class PrintDivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int i=1;
        for(;i<=n;i++){
            if(n%i==0){
                System.out.printf("%d ",i);
            }
        }



    }
}