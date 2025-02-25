package com.example;

import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        // Ввод угла пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите угол в градусах: ");
        double angle = scanner.nextDouble();

        // Перевод угла из градусов в радианы
        angle = angle * Math.PI / 180;

        // Вычисление синуса и косинуса
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);

        // Вывод результатов
        System.out.println("Синус угла " + angle + " градусов равен " + sin);
        System.out.println("Косинус угла " + angle + " градусов равен " + cos);
    }
}
