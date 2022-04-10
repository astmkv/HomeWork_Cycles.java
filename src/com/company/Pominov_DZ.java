package com.company;

public class Pominov_DZ {

    public static void main(String[] args) {

        for (int i = 1; i < 1000000; i++) {

            int length = String.valueOf(i).length(); // получили длину нашего числа

            int sum = 0;
            int checkNum = i;                               // число для проверки

            for ( ; checkNum != 0; checkNum /= 10 ) {
               int digit = checkNum % 10;
               sum += Math.pow(digit, length);

            }
            if (sum == i)
                System.out.print(i + " ");
        }

    }
}
