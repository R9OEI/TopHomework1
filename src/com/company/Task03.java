package com.company;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите дробное число: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        int res = (int) Math.round(number);
        System.out.println("Результат округления числа равен: " + res);
    }
}
