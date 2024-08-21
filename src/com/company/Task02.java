package com.company;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int res = 0;
        System.out.println("Введите трёхзначное число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] massNumber = new int[3];
        for(int i = massNumber.length -1; i >= 0; i--){
            massNumber[i] = number % 10;
            number = number / 10;
        }
        for (int i = massNumber.length - 1; i >= 0; i--){
            res = res + massNumber[i];
        }
        System.out.println("Результат сложение цифр вв введённом числе равен: " + res);
    }
}
