package com.example.definenumbersprimes;

import java.util.Scanner;
public class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime numbers between 1 and  " + number + ":");
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i && isPrime; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}



