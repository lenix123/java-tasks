package com.company.class_work2;

class Four {
    public static void main(String[] args) {
        System.out.println(Cylinder.surfaceCylinder(2, 2));
        System.out.println(Cylinder.surfaceCylinder(2.0, 2.0));
        System.out.println(Cylinder.surfaceCylinder("2", "2"));

        System.out.println(Cylinder.volumeCylinder(2, 2));
        System.out.println(Cylinder.volumeCylinder(2.0, 2.0));
        System.out.println(Cylinder.volumeCylinder("2", "2"));
    }
}

class Cylinder {
    static double surfaceCylinder(int r, int h) {
        return 2*Math.PI*Math.pow(r, 2) + 2*Math.PI*r*h;
    }

    static double surfaceCylinder(double r, double h) {
        return 2*Math.PI*Math.pow(r, 2) + 2*Math.PI*r*h;
    }

    static double surfaceCylinder(String r_str, String h_str) {
        double r = Double.parseDouble(r_str.trim());
        double h = Double.parseDouble(h_str.trim());

        return 2*Math.PI*Math.pow(r, 2) + 2*Math.PI*r*h;
    }

    static double volumeCylinder(int r, int h) {
        return Math.PI*Math.pow(r, 2)*h;
    }

    static double volumeCylinder(double r, double h) {
        return Math.PI*Math.pow(r, 2)*h;
    }

    static double volumeCylinder(String r_str, String h_str) {
        double r = Double.parseDouble(r_str.trim());
        double h = Double.parseDouble(h_str.trim());

        return Math.PI*Math.pow(r, 2)*h;
    }
}
