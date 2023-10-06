package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
       //This code is find division and remainder
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstNumber= scanner.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber= scanner.nextInt();

        double division=firstNumber/secondNumber;
        int remainder= firstNumber%secondNumber;
        System.out.println("Division is="+division+"\n"+"remainder="+remainder);
    }
}