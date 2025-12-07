package com.sk.LamdaExpression.calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator add = (n1, n2) -> n1 + n2;
        add.calculate(5.2, 2.4);

        Calculator sub = (n1, n2) -> n1 - n2;
        sub.calculate(5.2, 2.4);

        Calculator mul = (n1, n2) -> n1 * n2;
        mul.calculate(5.2, 2.4);

        Calculator div = (n1, n2) -> n1 / n2;
        div.calculate(5.2, 2.4);
    }
}
