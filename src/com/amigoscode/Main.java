package com.amigoscode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String numbers = "0.90, 1.00, 9.00, 8.78, 0.01";

        double result = 0;

        String[] perro = numbers.split(", ");

        for (int i = 0; i < perro.length; i++) {
            double temp1 = Double.parseDouble(perro[i]);
            result += temp1;
        }

        System.out.println(Arrays.toString(perro));
        System.out.println(result);
    }

}