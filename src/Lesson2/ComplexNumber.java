package Lesson2;

import java.util.Scanner;

public class ComplexNumber {
    private double real; // действительная часть
    private double imaginary; // мнимая часть

    public static void ComplexNumTester() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите номер операции");
            System.out.println("1.Cоздание нового числа по действительной части");
            System.out.println("2.Создание нового числа по действительной и мнимой части");
            System.out.println("3.Сложение");
            System.out.println("4.Вычитание");
            System.out.println("5.Умножение");
            System.out.println("6.Деление");
            int zd = scanner.nextInt();
            if (zd == 1) {
                ComplexNumber.realComplexNum();
            } else if (zd == 2) {
                ComplexNumber.realImagComplexNum();
            } else if (zd == 3) {
                ComplexNumber.complexSum();
            } else if (zd == 4) {
                ComplexNumber.complexSubtr();
            } else if (zd == 5) {
                ComplexNumber.complexMult();
            } else if (zd == 6) {
                ComplexNumber.complexDiv();
            } else {
                System.out.println("Введено неправильное число");
            }
        }
    }

    public static void realComplexNum() {
        System.out.println("Создание комплексного числа по действительной части");
        System.out.println("Введи действительное число в формате 3 или 3,123...");
        try (Scanner scanner = new Scanner(System.in)) {
            ComplexNumber complexNumber = new ComplexNumber(scanner.nextDouble());
            System.out.println(complexNumber.toString());
        }
    }

    public static void realImagComplexNum() {
        System.out.println("Создание комплексного числа по действительной и мнимой части");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи действительное число в формате 3 или 3,123...");
            double a = scanner.nextDouble();
            System.out.println("Введи мнимое число в формате 3 или 3,123...");
            double b = scanner.nextDouble();
            ComplexNumber complexNumber = new ComplexNumber(a, b);
            System.out.println(complexNumber.toString());
        }
    }

    public static void complexSum() {
        System.out.println("Для операции суммирования нужно ввести два комплексных числа");
        System.out.println("Введите первое комплексное число в формате 'действительное число'+0");
        System.out.println(" (если мнимая часть отсутствует)");
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            ComplexNumber complexNumber1 = new ComplexNumber(a, b);
            System.out.println("Введите второе комплексное число в формате 'действительное число'+0");
            System.out.println(" (если мнимая часть отсутствует)");
            double i = scanner.nextDouble();
            double j = scanner.nextDouble();
            ComplexNumber complexNumber2 = new ComplexNumber(i, j);
            ComplexNumber complexNumber3 = complexNumber1.sum(complexNumber2);
            System.out.println("Результат:");
            System.out.println(complexNumber3);
        }
    }

    public static void complexSubtr() {
        System.out.println("Для операции вычитания нужно ввести два комплексных числа");
        System.out.println("Введите первое комплексное число в формате 'действительное число'+0");
        System.out.println(" (если мнимая часть отсутствует)");
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            ComplexNumber complexNumber1 = new ComplexNumber(a, b);
            System.out.println("Введите второе комплексное число в формате 'действительное число'+0");
            System.out.println(" (если мнимая часть отсутствует)");
            double i = scanner.nextDouble();
            double j = scanner.nextDouble();
            ComplexNumber complexNumber2 = new ComplexNumber(i, j);
            ComplexNumber complexNumber3 = complexNumber1.subtract(complexNumber2);
            System.out.println("Результат:");
            System.out.println(complexNumber3);
        }
    }

    public static void complexMult() {
        System.out.println("Для операции умножения нужно ввести два комплексных числа");
        System.out.println("Введите первое комплексное число в формате 'действительное число'+0");
        System.out.println(" (если мнимая часть отсутствует)");
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            ComplexNumber complexNumber1 = new ComplexNumber(a, b);
            System.out.println("Введите второе комплексное число в формате 'действительное число'+0");
            System.out.println(" (если мнимая часть отсутствует)");
            double i = scanner.nextDouble();
            double j = scanner.nextDouble();
            ComplexNumber complexNumber2 = new ComplexNumber(i, j);
            ComplexNumber complexNumber3 = complexNumber1.multiply(complexNumber2);
            System.out.println("Результат:");
            System.out.println(complexNumber3);
        }
    }

    public static void complexDiv() {
        System.out.println("Для операции деления (получения модуля) нужно ввести два комплексных числа");
        System.out.println("Введите первое комплексное число в формате 'действительное число'+0");
        System.out.println(" (если мнимая часть отсутствует)");
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            ComplexNumber complexNumber1 = new ComplexNumber(a, b);
            System.out.println("Введите второе комплексное число в формате 'действительное число'+0");
            System.out.println(" (если мнимая часть отсутствует)");
            double i = scanner.nextDouble();
            double j = scanner.nextDouble();
            ComplexNumber complexNumber2 = new ComplexNumber(i, j);
            ComplexNumber complexNumber3 = complexNumber1.divide(complexNumber2);
            System.out.println("Результат:");
            System.out.println(complexNumber3);
        }
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //Операция сложения
    public ComplexNumber sum(ComplexNumber other) {
        double realPart = this.real + other.getReal();
        double imaginaryPart = this.imaginary + other.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    //Операция вычитания
    public ComplexNumber subtract(ComplexNumber other) {
        double realPart = this.real - other.getReal();
        double imaginaryPart = this.imaginary - other.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    //Операция умножения
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double imaginaryPart = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    //Операция деления
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double realPart = (this.real * other.getReal() + this.imaginary * other.getImaginary()) / denominator;
        double imaginaryPart = (this.imaginary * other.getReal() - this.real * other.getImaginary()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public String toString() {
        if (imaginary != 0) {
            if (imaginary >= 0) {
                return real + "+" + imaginary + "i";
            } else {
                return real + "" + imaginary + "i";
            }
        } else {
            return real + "";
        }
    }
}
