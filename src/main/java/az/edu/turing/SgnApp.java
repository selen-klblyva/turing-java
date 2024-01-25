package az.edu.turing;

import java.util.Scanner;

public class SgnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if(x>0){
            int y=1;
            System.out.println(y);
        }
        else if(x<0){
            int y=-1;
            System.out.println(y);
        }
        else{
            int y=0;
            System.out.println(y);
        }
    }
}
