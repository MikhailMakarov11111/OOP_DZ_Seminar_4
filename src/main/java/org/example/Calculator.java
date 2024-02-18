package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {

    public double sum(List<? extends Number> numbers){
        double s = 0;

        for (Number number : numbers) {
            s += number.doubleValue();
        }
        return s;
    }

    public double сomposition(List<? extends Number> numbers){
        double com = 1;

        for (Number number : numbers) {
            com *= number.doubleValue();
        }
        return com;
    }

    public double quotient(List<? extends Number> numbers){
        double quo = numbers.indexOf(0);

        for (int i = 1; i <numbers.size(); i++) {
            quo /= numbers.indexOf(i);
        }
        return quo;
    }
}