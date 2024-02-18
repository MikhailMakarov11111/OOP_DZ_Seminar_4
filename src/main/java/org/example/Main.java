package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Добро пожаловать в Калькулятор, для того чтобы \n " +
                    "продолжить выберите дейтствие:\n" +
                    "1. Сложение; \n" +
                    "2. Умножение; \n" +
                    "3. Деление; \n" +
                    "4. Бинарный перевод; \n" +
                    "5. Закрыть приложение");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Введите колличество чисел которые вы хотите сложить: ");
                    int sizeNum = sc.nextInt();
                    List<Double> list1 = numbers(sizeNum, sc);
                    Calculator summa = new Calculator();
                    System.out.println("Сумма введнных Вами чисел равна " + summa.sum(list1));
                    break;
                case 2:
                    System.out.println("Введите колличество чисел которые вы хотите перемножить: ");
                    int sizeCom = sc.nextInt();
                    List<Double> list2 = numbers(sizeCom, sc);
                    Calculator com = new Calculator();
                    System.out.println("Произведение введнных Вами чисел равно "
                            + com.composition(list2));
                    break;
                case 3:
                    System.out.println("Введите колличество чисел которые вы хотите поделить: ");
                    int sizeQuo = sc.nextInt();
                    List<Double> list3 = numbers(sizeQuo, sc);
                    Calculator quo = new Calculator();
                    System.out.println("Частное введнных Вами чисел равно "
                            + quo.quotient(list3));
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Спасибо что воспользовались нашим приложение!\n" +
                            "Ждем вас снова!");
                default:
                    System.out.println("Вы ввели некорректное значение, пожалуйста попробуйте еще раз \n" +
                            "или введите цифру 5 чтобы выйти из приложения");;
            }
        }


        }

        private static List<Double> numbers ( int size, Scanner sc){
            List<Double> list = new ArrayList<>();
            System.out.println("Введите " + size + " чисел: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextDouble());
            }
            return list;
        }
    }