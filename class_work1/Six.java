package com.company.class_work1;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Six {
    public static void main(String[] args) {
        char[] my_array = new char[]{'k', 'b', 'f', 't', 'e', 'c', 'o', 'w', 'r', 'n', 'q', 'a', '1', 'l', '9'};
        System.out.println(my_array);
        Arrays.sort(my_array);
        System.out.println(my_array);

        char[] new_array = new char[10];
        System.arraycopy(my_array, 0, new_array, 0, 5);
        System.arraycopy(my_array, 10, new_array, 5, 5);
        System.out.println(new_array);
    }
}
