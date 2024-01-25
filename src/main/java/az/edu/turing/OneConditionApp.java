package az.edu.turing;

import java.util.Scanner;
public class OneConditionApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);


        int n=scanner.nextInt();
        if (n%2!=0 || (n>=100 && n<=999)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}