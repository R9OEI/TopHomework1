package com.company;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        int integerNumber = (int) number;
        if(number == integerNumber) System.out.println("Число не имеет вещественную часть");
        else System.out.println("число имеет вещественную часть");
    }
}
