package com.company.class_work2;

public class Three {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.count(12, 3);
        a.show();

        b.count(12, 3);
        b.show();

        c.count(12, 3);
        c.show();

        d.count(12, 3);
        d.show();
    }
}

class A {
    void count(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    void show() {
        System.out.println("название класса - A");
    }
}

class B extends A {
    void count(int a, int b) {
        int sum = a - b;
        System.out.println(sum);
    }

    void show() {
        System.out.println("название класса - B");
    }
}

class C extends A {
    void count(int a, int b) {
        int sum = a * b;
        System.out.println(sum);
    }

    void show() {
        System.out.println("название класса - C");
    }
}

class D extends B {
    void count(int a, int b) {
        int sum = a / b;
        System.out.println(sum);
    }

    void show() {
        System.out.println("название класса - D");
    }
}
