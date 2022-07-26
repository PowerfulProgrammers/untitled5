package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        
        

        System.out.print("num1 = ");
        int num1 = scanner.nextInt();
        System.out.print("num2 = ");
        int num2 = scanner.nextInt();
        boolean res = num1 < num2;
        System.out.println(num1+" < "+num2 +" res "+res);











    }
}
