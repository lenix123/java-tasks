package com.company.home_work2;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        boolean is_continue = true;
        while (is_continue) {
            if (is_next("Вы хотите создать машину? (y/n) ")) {
                getParams();
            } else {
                is_continue = false;
            }
        }
    }

    static void getParams() {
        System.out.print("Введите модель машины: ");
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();

        String[] questions = new String[]{"Введите максимальную скорость: ", "Введите вес машины: "};
        int[] params = new int[2];
        int paramsCount = 0;
        for (int i=0; i < questions.length; i++) {
            if (is_next("Вы хотите продолжить? (y/n): ")) {
                System.out.print(questions[i]);
                params[i] = sc.nextInt();
                paramsCount++;
            } else {
                break;
            }
        }

        Car car = makeCar(paramsCount, model, params);
        car.show();
    }

    static boolean is_next(String question) {
        System.out.print(question);
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if (answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    static Car makeCar(int paramsCount, String model, int[] params) {
        switch (paramsCount) {
            case 1:
                return new Car(model, params[0]);
            case 2:
                return new Car(model, params[0], params[1]);
            default:
                return new Car(model);
        }
    }
}



class Car {
    protected String model;
    protected int maxSpeed;
    protected int weight;

    Car(String model) {
        this.model = model;
    }

    Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    Car(String model, int maxSpeed, int weight) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    void show() {
        System.out.println("Модель машины: " + model);
        if (maxSpeed != 0) {
            System.out.println("Максимальная скорость машины: " + maxSpeed);
            if (weight != 0) {
                System.out.println("Вес машины: " + weight);
            }
        }
    }
}
