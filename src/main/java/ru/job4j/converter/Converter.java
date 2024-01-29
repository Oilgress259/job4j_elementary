package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollars = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollars + " dollars");
        float inputEuro = 140;
        float inputDollars = 120;
        float expectedEuro = 2;
        float expectedDollar = 2;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        float outputDollar = Converter.rubleToDollar(inputDollars);
        boolean passedEuro = expectedEuro == outputEuro;
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("120 rubles are 2. Test result : " + passedDollar);

    }

}
