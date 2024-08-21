package com.company;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Введите годовой процент по вкладу: ");
        Scanner scan = new Scanner(System.in);
        double percentVolume = scan.nextDouble();
        System.out.println("Введите сумму вклада: ");
        double contribution = scan.nextDouble();
        double Percent = (contribution / 100 * percentVolume * 2) + contribution;
        System.out.println("Сумма вклада через два года равна: " + Percent);
    }
}
