package ru.job4j.calculator;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return ru.job4j.math.MathFunction.difference(first, second)
                + ru.job4j.math.MathFunction.divide(first, second);
    }

    public static double sumMethod(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.divide(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.difference(first, second);
    }

        public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumMethod(10, 20));
    }
}
