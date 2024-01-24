package org.example;

import java.util.Scanner;
public class Season1App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();

        String isValidinput=(num<1 && num>12)? "Wrong"
                :(num>=3 && num<6)? "Spring"
                :(num>=6 && num<9)? "Summer"
                :(num>=9 && num<=11)? "Autumn":"Winter";
        System.out.println(isValidinput);

    }
}