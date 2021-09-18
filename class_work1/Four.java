package com.company.class_work1;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        boolean is_continue = true;

        while (is_continue) {
            boolean answer = ask_is_continue();

            if (answer) {
                is_inside();
            } else {
                is_continue = false;
            }
        }
    }

    public static boolean ask_is_continue() {
        System.out.print("Вы хотите продолжить исполнение программы? (y/n) ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if (answer.equals("y")) {
            return true;
        } else if (answer.equals("n")) {
            return false;
        } else {
            return ask_is_continue();
        }
    }

    public static void is_inside() {
        double start = -2, end = 2;
        System.out.print("Введите число ");
        Scanner sc = new Scanner(System.in);
        double point = sc.nextDouble();

        if (point <= end & point >= start) {
            System.out.println("Число " + point + " принадлежит промежутку: [" + start + ":" + end + "]");
        } else {
            System.out.println("Число " + point + " не принадлежит промежутку: [" + start + ":" + end + "]");
        }
    }
}
