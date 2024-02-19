package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Calculator {

    public double sum(List<? extends Number> numbers) {
        double s = 0;

        for (Number number : numbers) {
            s += number.doubleValue();
        }
        return s;
    }

    public double composition(List<? extends Number> numbers) {
        double com = 1;

        for (Number number : numbers) {
            com *= number.doubleValue();
        }
        return com;
    }

    public double quotient(List<? extends Number> numbers) {
        double quo = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).doubleValue() == 0.0) {
                throw new ArithmeticException("Деление на ноль запрещено!");
            }
            quo /= numbers.get(i).doubleValue();
        }
        return quo;
    }

    public static int binaryToDecimal(int num) {
        String binaryString = String.valueOf(num);
        if (!binaryString.matches("[01]+")) {
            throw new IllegalArgumentException("Неверный формат двоичного числа");
        }

        int decimalNumber = 0;
        int base = 1;

        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            decimalNumber += lastDigit * base;
            base = base * 2;
        }

        return decimalNumber;
    }

    public static int binaryStringToDecimal(String binaryString) {
        if (!binaryString.matches("[01]+")) {
            throw new IllegalArgumentException("Неверный формат двоичного числа");
        }

        int binaryNumber = Integer.parseInt(binaryString, 2);
        return binaryNumber;
    }


}