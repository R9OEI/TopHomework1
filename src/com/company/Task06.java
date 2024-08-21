package com.company;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника: ");
        final int w = scan.nextInt();
        System.out.println("Введите высоту прямоугольника: ");
        final int h = scan.nextInt();
        System.out.println("Периметр прямоугольника равен: " + (w + h) * 2);
        System.out.println("Площадь прямоугольника равна: " + w * h);
    }
}
