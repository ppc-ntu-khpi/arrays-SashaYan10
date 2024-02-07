package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: "); 
        int number = scanner.nextInt(); // ввід числа
        scanner.close();

        if (Exercise.isArmstrong(number)) { // перевіряємо, чи є число числом Армстронга
            System.out.println(number + " є числом Армстронга.");
        } else {
            System.out.println(number + " не є числом Армстронга.");
        }
    }
}
