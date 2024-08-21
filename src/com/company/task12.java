package com.company;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        System.out.println("Сколько процентов учеников имеют вес меньше 30 кг?");
        Scanner scan = new Scanner(System.in);
        int percentOfSmall = scan.nextInt();
        System.out.println("Сколько всего учеников учится в первых классах: ");
        int quantityOfStudents = scan.nextInt();
        int additionalMilk = quantityOfStudents * percentOfSmall / 100;
        int milk = additionalMilk + quantityOfStudents;
        System.out.println("Количество дополнительных стаканов молока: " + additionalMilk + " стаканов");
        System.out.println("Всего молока: " + milk + " стаканов, и столько же пирожков");
        double quantityOfMilliliters = milk * 200;
        System.out.print("То есть " + quantityOfMilliliters / 1000 + " литров, ");
        double packetOfMilk = quantityOfMilliliters / 900;
        System.out.println("или " + (int) Math.ceil(packetOfMilk) + " пакетов молока");
    }
}
