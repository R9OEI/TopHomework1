package com.company;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение радиуса отружности: ");
        final int radius = scan.nextInt();
        System.out.println("Площадь окружность равна: " + Math.PI * Math.pow(radius, 2));
        System.out.println("Длина окружности равна: " + Math.PI * radius);
    }
}
