package az.edu.turing;

import java.util.Scanner;
public class OneCondition1App {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);



        int n=scanner.nextInt();
        if ((n%2==0 && n>0) || (n%2!=0 && n<0)){
            System.out.print("NO");
        }

        else if((n%2==0 && n>0) && (n%2!=0 && n<0)) {
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}