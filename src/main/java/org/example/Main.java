package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Калькулятор, для того чтобы \n " +
                "продолжить выберите дейтствие:\n" +
                "1. Сложение; \n" +
                "2. Умножение; \n" +
                "3. Деление; \n" +
                "4. Бинарный перевод; \n" +
                "5. Закрыть приложениею");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Введите колличество чисел которые вы хотите сложить: ");
                int size = sc.nextInt();
                List<Double> list = numbers(size, sc);
                Calculator calculator = new Calculator();
                System.out.println("Сумма введнных Вами чисел равна " + calculator.sum(list));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sc.nextInt());
        }


    }

    private static List<Double> numbers(int size, Scanner sc) {
        List<Double> list = new ArrayList<>();
        System.out.println("Введите " + size + " чисел: ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextDouble());
        }
        return list;
    }
}