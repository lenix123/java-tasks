package com.company.home_work2;

class Two {
    public static void main(String[] args) {
        Parallelepiped par = new Parallelepiped(3, 3, 3);
        System.out.println(par.parallVolume(par));
        System.out.println(par.parallSquare(par));
    }
}

class Parallelepiped {
    private int a;
    private int b;
    private int c;

    Parallelepiped(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getA() {
        return a;
    }

    int getB() {
        return b;
    }

    int getC() {
        return c;
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    void setC(int c) {
        this.c = c;
    }

    int parallVolume(Parallelepiped par) {
        return par.getA()*par.getB()*par.getC();
    }

    int parallSquare(Parallelepiped par) {
        return 2 * (par.getA() * par.getB() + par.getA() * par.getC() + par.getB() * par.getC());
    }
}
