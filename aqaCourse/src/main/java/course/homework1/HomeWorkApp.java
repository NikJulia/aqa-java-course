package course.homework1;

import java.io.IOException;
import java.util.Scanner;


public class HomeWorkApp {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        in.close();
    }

    public static void printThreeWords() {
        System.out.println("""
                Фрукты на выбор:
                Orange
                Banana
                Apple""");
    }

    public static void checkSumSign() {
        System.out.println("Нахождение суммы двух чисел");
        System.out.print("Введите певрое число и нажмите Enter: ");
        int a = in.nextInt();
        System.out.print("Введите второе число и нажмите Enter: ");
        int b = in.nextInt();

        if (a + b >= 0) {
            System.out.println("Сумма введенных чисел положительная");
        } else System.out.println("Сумма введенных чисел отрицательная");
    }

    public static void printColor() {
        System.out.println("Угадай цвет");
        System.out.print("Введите любое целое число от 0 до 100 и нажмите Enter: ");
        int value = in.nextInt();

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.println("Сравнение чисел");
        System.out.print("Введите певрое число и нажмите Enter: ");
        int a = in.nextInt();
        System.out.print("Введите второе число и нажмите Enter: ");
        int b = in.nextInt();

        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}