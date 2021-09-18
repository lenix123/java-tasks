package com.company.home_work1;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        String[] name_list = new String[]{"Вася", "Ваня", "Маша", "Илья", "Артём", "Денчик"};

        Scanner sc_name = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name_input = sc_name.nextLine();

        boolean is_name_in = false;
        for (String name : name_list) {
            if (name_input.equals(name)) {
                is_name_in = true;
            }
        }

        if (is_name_in) {
            System.out.println("Имя есть в массиве!");
        } else {
            System.out.println("Имени нет в массиве!");
        }
    }
}
