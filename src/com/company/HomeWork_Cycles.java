package com.company;

import java.util.Scanner;

public class HomeWork_Cycles {

    public static void main(String[] args) {

        // Задание 1. Числа Фибоначчи

        System.out.println("\n\nЗадание 1. Числа Фибоначчи");

        int a = 0, b = 1;

        System.out.print(a + ", ");

        while (b + a < 10000000) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + ", ");
        }

        // Задание 3. Число Армстронга

        System.out.println("\n\nЗадание 3. Числа Армстронга");

        for (int i = 1; i < 1000000; i++) {

            int length = String.valueOf(i).length();        // получили длину нашего числа

            int sum = 0;
            int checkNum = i;                               // число для проверки

            for (; checkNum != 0; checkNum /= 10) {
                int digit = checkNum % 10;
                sum += Math.pow(digit, length);

            }
            if (sum == i)
                System.out.print(i + " ");
        }

        // Задание 5. Палиндром

        System.out.println("\n\nЗадание 5. Палиндром");

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        int  result = 0, myNumber = num;

        for (; num > 0; num /= 10 ) {
            int unit = num % 10;
            result = (result * 10) + unit;
        }
        String output =  myNumber == result? " " : " НЕ ";
            System.out.println("Число" + output + "является палиндромом");

    }
}