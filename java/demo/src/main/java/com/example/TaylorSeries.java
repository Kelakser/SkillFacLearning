package com.example;

import java.util.Scanner;

public class TaylorSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x:");
        double x = scanner.nextDouble();
        scanner.close();

        // Вычисление косинуса через ряд Тейлора
        double cosValue = calculateCos(x);

        // Вывод результата
        System.out.printf("Косинус x через ряд Тейлора: %f%n", cosValue);

        // Вычисление синуса через ряд Тейлора
        double sinValue = calculateSin(x);
      
        // Вывод результата
        System.out.printf("Синус x через ряд Тейлора: %f%n", sinValue);
    }

    private static double calculateCos(double x) {
        double result = 0;
        int n = 6; // Количество членов ряда

        for (int k = 0; k <= n; k++) {
            result += Math.pow(-1, k) * Math.pow(x, 2 * k) / factorial(2 * k);
        }
        return result;
    }

    private static double calculateSin(double x) {
        double result = x;
        int n = 6; // Количество членов ряда
  
        for (int k = 1; k <= n; k++) {
            result += (-1) * Math.pow(x, 2 * k + 1) / factorial(2 * k + 1);
        }
        return result;
    }

    // Функция для вычисления факториала числа n
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}