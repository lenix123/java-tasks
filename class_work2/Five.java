package com.company.class_work2;

import java.util.Scanner;

class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num = sc.nextDouble();
        System.out.println("Введите степень: ");
        int pow = sc.nextInt();
        System.out.println(MathUtils.pow(num, pow));

        System.out.println("Введите число: ");
        int number = sc.nextInt();

        System.out.println(MathUtils.factorial(number));
    }
}

class MathUtils {
    static double pow(double number, int power) {
        return Math.pow(number, power);
    }

    static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number*factorial(number-1);
        }
    }
}
