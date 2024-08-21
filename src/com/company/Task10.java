package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите ваш рост: ");
        Scanner scan = new Scanner(System.in);
                double height = scan.nextDouble();
        System.out.println("Введите ваш вес: ");
                double weight = scan.nextDouble();
                double idealWeight = height - 110;
                double needToCorrect = weight - idealWeight;
        System.out.println("Идеальный вес для вас: " + idealWeight);
                if(needToCorrect < 0) {
                    needToCorrect = -needToCorrect;
                    System.out.println("Вам необходимо прибавить " + needToCorrect + " килограмм");
                }
                else System.out.println("Вам необходимо сбросить " + needToCorrect + " килограмм");
    }
}
