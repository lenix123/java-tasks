package com.company.class_work1;

public class Two {
    public static void main(String[] args) {
        System.out.println(parallelepiped_volume(2, 2, 2));
        System.out.println(sphere_volume(3));
        System.out.print(cylinder_volume(3, 10));
    }

    public static float parallelepiped_volume(float a, float b, float c) {
        return a*b*c;
    }

    public static float sphere_volume(float r) {
        return 4*3.14f*r*r*r/3;
    }

    public static float cylinder_volume(float r, float h) {
        return 3.14f*r*r*h;
    }
}
