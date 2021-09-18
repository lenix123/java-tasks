package com.company.class_work2;

class One {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0, 1.0, 2.0);
        circle.print();

        circle.move();
        circle.print();

        System.out.println(circle.distToOtherCircle());

        circle.changeRadius();
        circle.print();

        System.out.println(circle.getPerimetr());
        System.out.println(circle.getSquare());
    }
}

class Circle {
    private Double x;
    private Double y;
    private Double r;

    Circle(Double x, Double y, Double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    void print() {
        System.out.println("Кооординаты: (" + x + "," + y + "," + r + ")");
    }

    void move() {
        x++;
        y++;
    }

    double distToOtherCircle() {
        return r;
    }

    void changeRadius() {
        r++;
    }

    double getPerimetr() {
        return 2*3.14*r;
    }

    double getSquare() {
        return 3.14*r*r;
    }
}
