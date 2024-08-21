package com.company;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        final int speedOfSound = 343;
        System.out.println("Сколько секунд прошло от вспышки до раската грома? ");
        Scanner scan = new Scanner(System.in);
        final int second = scan.nextInt();
        System.out.println("Расстояние до места удара молнии равно: " + speedOfSound * second + " метра");
    }
}
