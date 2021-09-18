package com.company.class_work1;

public class Main {

    public static void main(String[] args) {
	    String str = "123";
        int str_to_int = translate_to_int(str);
        double str_to_double = translate_to_double(str);
        System.out.print(str_to_int + (int) str_to_double);
    }

    public static int translate_to_int(String str) {
        return Integer.parseInt(str.trim());
    }

    public static double translate_to_double(String str) {
        return Double.parseDouble(str.trim());
    }
}
