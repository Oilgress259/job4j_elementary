package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumMethod(double first, double second) {
        return sum(first, second)
                + divide(first, second)
                + multiply(first, second)
                + difference(first, second);
    }

        public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumMethod(10, 20));
    }
}
