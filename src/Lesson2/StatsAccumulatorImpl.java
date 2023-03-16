package Lesson2;

import java.util.Scanner;

public class StatsAccumulatorImpl implements StatsAccumulator{
    private int value;

    @Override
    public void add(int value) {
        this.value = value;
    }

    @Override
    public int getMin() {
        System.out.println("Поиск минимального числа");
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    @Override
    public int getMax() {
        System.out.println("Поиск минимального числа");
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public int getCount() {
        System.out.println("Возвращение количества всех добавленных чисел");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNextInt()) {
            count++;
            scanner.nextInt();
        }
        scanner.close();
        return count;
    }

    @Override
    public Double getAvg() {
        System.out.println("Возвращение среднего арифметического");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (scanner.hasNextInt()) {
            count++;
            sum += scanner.nextInt();
        }
        scanner.close();
        return count > 0 ? (double) sum / count : 0;
    }
}
