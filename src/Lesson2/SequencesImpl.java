package Lesson2;

import java.util.Scanner;

public class SequencesImpl implements SequenceGenerator{
    public static void SequencesTest() {
        //Добавить проверки
        SequencesImpl SequencesImpl = new SequencesImpl();
        System.out.println("Какую последовательность запускаем? (A, B, C, D, E, F, G, H, I, J)");
        try (Scanner scanner = new Scanner(System.in)) {
            String param = scanner.nextLine();

            if (param.equals("A")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.a(scanner.nextInt());
            } else if (param.equals("B")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.b(scanner.nextInt());
            } else if (param.equals("C")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.c(scanner.nextInt());
            } else if (param.equals("D")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.d(scanner.nextInt());
            } else if (param.equals("E")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.e(scanner.nextInt());
            } else if (param.equals("F")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.f(scanner.nextInt());
            } else if (param.equals("G")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.g(scanner.nextInt());
            } else if (param.equals("H")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.h(scanner.nextInt());
            } else if (param.equals("I")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.i(scanner.nextInt());
            } else if (param.equals("J")) {
                System.out.println("Введите количество элементов последовательности");
                SequencesImpl.j(scanner.nextInt());
            } else {
                return;
            }
        }
    }

    @Override
    public void a(int n) {
        if (n > 0 && n != 0) {
            for (int i = 0; i < n; i++) {
                System.out.println((i * 2) + 2);
            }
        } else {
            System.out.println("Введено неверное значение!");
        }
    }

    @Override
    public void b(int n) {
        if (n > 0 && n != 0) {
            for (int i = 0; i < n; i++) {
                System.out.println((i * 2) + 1);
            }
        } else {
            System.out.println("Введено неверное значение!");
        }
    }

    @Override
    public void c(int n) {
        if (n > 0 && n != 0) {
            for (int i = 1; i < n + 1; i++) {
                System.out.println((i * i));
            }
        } else {
            System.out.println("Введено неверное значение!");
        }
    }

    @Override
    public void d(int n) {
        if (n > 0 && n != 0) {
            for (int i = 1; i < n + 1; i++) {
                System.out.println((i * i * i));
            }
        } else {
            System.out.println("Введено неверное значение!");
        }
    }

    @Override
    public void e(int n) {
        if (n > 0 && n != 0) {
            for (int i = 0; i < n; i++) {
                if ((i % 2) == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(-1);
                }
            }
        } else {
            System.out.println("Введено неверное значение!");
        }
    }

    @Override
    public void f(int n) {
        if (n > 0 && n != 0) {
            for (int i = 1; i < n + 1; i++) {
                if ((i % 2) == 0) {
                    System.out.println(-i);
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Введено неверное значение!");
        }
    }

    @Override
    public void g(int n) {
        if (n > 0 && n != 0) {
            for (int i = 1; i < n + 1; i++) {
                if ((i % 2) == 0) {
                    System.out.println((i * i) * (-1));
                } else {
                    System.out.println(i * i);
                }

            }
        } else {
            System.out.println("Введено неверное значение!");
        }
    }

    @Override
    public void h(int n) {
        int[] arr1 = new int[n];
        int[] arr3 = new int[n * 2];
        for (int i = 0; i < n; i++) {
            arr1[i] = i + 1;
        }
        int[] arr2 = arr3;
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                arr3[i] = arr1[i / 2];
            } else {
                arr3[i] = arr2[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr3[i]);
        }
    }

    @Override
    public void i(int n) {
        if (n > 0 && n != 0) {
            int a = 1;
            System.out.println(a);
            for (int i = 2; i < n + 1; i++) {
                System.out.println(a *= i);
            }
        } else {
            System.out.println("Введено неверное значение!");
        }
    }

    @Override
    public void j(int n) {
        int first = 1;
        int second = 2;
        System.out.println(first);
        if (n > 1) {
            for (int i = 2; i <= n; ++i) {
                System.out.println(first);
                int sum = first + second;
                first = second;
                second = sum;
            }
        }

    }
}
