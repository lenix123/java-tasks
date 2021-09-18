package com.company.class_work1;

public class Five {
    public static void main(String[] args) {
        int[]  first_array = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[]  second_array = new int[]{ 1,3,3,1,5,9,7,2,9,3 };

        String differences = "";
        for (int i=0; i<first_array.length; i++) {
            if (first_array[i] != second_array[i]) {
                differences += i + " ";
            }
        }

        System.out.println("Номера отличающихся элементов (нумерация начинается с 0): " + differences);
    }
}
