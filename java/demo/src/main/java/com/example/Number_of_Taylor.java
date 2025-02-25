package com.example;

import java.util.Scanner;

public class Number_of_Taylor {
    public static void main(String[] args) {
        // Запрашиваем у пользователя, какую длину ряда он хочет
        Scanner scan_long_taylor = new Scanner(System.in);
        System.out.print("Введите длину ряда Тейлора (целое число): ");
        int long_taylor = scan_long_taylor.nextInt();
        

        // запрашиваем у пользователя точку x
        Scanner scan_x = new Scanner(System.in);
        System.out.print("Введите точку x для которой необходимо вычислить значения cos,sin x: ");
        double x = scan_x.nextDouble();
        // сверхужасный синтаксис java) 

        // проверяем корректность данных 
        if (long_taylor >= 0 && x!=0 ) {
            // умножаем длинну ряда на 2 т.к идет ряд через 1
            long_taylor = long_taylor * 2 ;
            int count_sin = 1;
            double result_sin = x/1;

            // делаем условия for по заданию
            for (int i = 2; i <= long_taylor; i++){
                if (i % 2 !=0){
                    if (count_sin %2 == 0){
                        result_sin += Math.pow(x, i)/factorial(i);
                        count_sin++;
                    }

                    else {
                        result_sin -= Math.pow(x,i)/factorial(i);
                        count_sin++;
                    }
                }
                else{
                    // можно было часть кода засунуть сюда
                    // но необходимо и for и while
                    //поэтому делаем уродца)
                }
            }
            int count_cos = 1;
            double result_cos = 1;
            int i = 1;
            while(i <= long_taylor){
                if (i % 2 ==0){
                    if (count_cos % 2 ==0) {
                        result_cos += Math.pow(x, i)/factorial(i);
                        count_cos ++;
                    }
                    else {
                        result_cos -= Math.pow(x,i)/factorial(i);
                        count_cos++;
                    }
                }
                i++;
            }
            System.out.println("Косинус угла в точке " + x + "  равен " + result_cos);
            System.out.println("Синус угла в точке " + x + "  равен " + result_sin);
        }


        
    }

    // Функция для вычисления факториала
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

