package com.company.home_work1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        request_arguments();
    }

    public static void request_arguments() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число ");
        String first_int = sc.nextLine();

        System.out.print("Введите оператор (+, -, *, /) ");
        String operator = sc.nextLine();

        System.out.print("Введите второе число ");
        String second_int = sc.nextLine();

        String[] argument_array = new String[]{first_int, operator, second_int};
        calculator(argument_array);
    }

    public static void calculator(String[] argument_array) {
        int first_int = Integer.parseInt(argument_array[0]);
        String operator = argument_array[1];
        int second_int = Integer.parseInt(argument_array[2]);

        int result;
        switch (operator) {
            case "+":
                result = first_int + second_int;
                break;
            case "-":
                result = first_int - second_int;
                break;
            case "*":
                result = first_int * second_int;
                break;
            case "/":
                result = first_int / second_int;
                break;
            default:
                result = 0;
        }

        System.out.println("результат: " + result);
        is_continue();
    }

    public static void is_continue() {
        System.out.print("Вы хотите продолжить исполнение программы? (y/n) ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if (answer.equals("y")) {
            request_arguments();
        }
    }
}
