package Lesson2;

import java.util.Scanner;

public class StartAllZD {
    //Этот класс запускает все задачи
    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите номер задачи");
            System.out.println("1.Sequences");
            System.out.println("2.Complex Numbers");
            System.out.println("3.RateLimitedPrinter");
            System.out.println("4.Snils Validator");
            System.out.println("5.StatsAccumulator");
            int zd = scanner.nextInt();
            if (zd == 1) {
                SequencesImpl.SequencesTest();
                //Работает
            } else if (zd == 2) {
                ComplexNumber.ComplexNumTester();
                //Работает
            } else if (zd == 3) {
                StartAllZD.RateLimitedPrinterStarter();
                //Работает
            } else if (zd == 4) {
                StartAllZD.snilsValidatorStarter();
                //Работает
            } else if (zd == 5) {
                StartAllZD.statsAccumulatorImplStarter();
            } else {
                System.out.println("Введено неправильное число");
            }
        }
    }

    public static void RateLimitedPrinterStarter() throws InterruptedException {
        RateLimitedPrinter rateLimitedPrinter;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите сообщение");
            String str = scanner.nextLine();
            System.out.println("Введите интервал в миллисекундах");
            int time = scanner.nextInt();
            rateLimitedPrinter = new RateLimitedPrinter(time);
            rateLimitedPrinter.print(str);
        }
    }

    public static void snilsValidatorStarter() {
        String snills;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите СНИЛС");
            snills = scanner.nextLine();
        }
        SnilsValidatorImpl snilsValidatorImpl = new SnilsValidatorImpl();
        System.out.println(snilsValidatorImpl.validate(snills));
    }

    public static void statsAccumulatorImplStarter() {
        StatsAccumulatorImpl statsAccumulatorImpl = new StatsAccumulatorImpl();
        int met;
        System.out.println("Какой метод будем использовать? Введите номер метода");
        System.out.println("1. Поиск минимального числа");
        System.out.println("2. Поиск максимального числа");
        System.out.println("3. Вывод количества всех добавленных чисел");
        System.out.println("4. Вывод среднего арифметического всех чисел");
        try (Scanner scanner = new Scanner(System.in)) {
            met = scanner.nextInt();
        }
        if (met == 1) {
            System.out.println("Вводите целые числа. Для завершения введите символ");
            System.out.println(statsAccumulatorImpl.getMin());
        } else if (met == 2) {
            System.out.println("Вводите целые числа. Для завершения введите символ");
            System.out.println(statsAccumulatorImpl.getMax());
        } else if (met == 3) {
            System.out.println("Вводите целые числа. Для завершения введите символ");
            System.out.println(statsAccumulatorImpl.getCount());
        } else if (met == 4) {
            System.out.println("Вводите целые числа. Для завершения введите символ");
            System.out.println(statsAccumulatorImpl.getAvg());
        } else {
            System.out.println("Введено неправильное число");
        }
    }
}
