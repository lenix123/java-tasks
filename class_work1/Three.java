package com.company.class_work1;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        double start = -2, end = 2;
        Scanner sc = new Scanner(System.in);
        double point = sc.nextDouble();

        if (point <= end & point >= start) {
            System.out.println("Число принадлежит промежутку: [" + start + ":" + end + "]");
        } else {
            System.out.println("Число не принадлежит промежутку: [" + start + ":" + end + "]");
        }
    }
}
