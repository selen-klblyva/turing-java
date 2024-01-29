package game.code;

import java.util.Scanner;


public class CircleApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        System.out.println(2 * Math.PI * r);
        System.out.println(Math.PI * Math.pow(r, 2));


    }
}
