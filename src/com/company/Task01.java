package com.company;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Введите первое число \"x\":");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Введите второе число \"y\":");
        int y = scan.nextInt();
        System.out.println("Результат деления x на y равен: " + x / y);
        System.out.println("Остаток от деления x на y равен: " + x % y);
        System.out.println("Корень квадратный от x равен: " + Math.sqrt(x));
    }
}
