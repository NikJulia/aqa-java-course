package course.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        checkSumRange();
        checkNumberSign1(numInput());
        checkNumberSign2(numInput());
        printStringNTimes(textInput(), numInput());
        checkYear(numInput());
        invertArray();
        fillArray();
        updateArray();
        fillArrayDiagonal();
        createArray(numInput(), numInput());
        in.close();
    }

    /*
    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
    public static boolean checkSumRange() {
        int a = numInput();
        int b = numInput();
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            System.out.println("Сумма введенных чисел лежит в пределах от 10 до 20 включительно");
            return true;
        } else {
            System.out.println("Сумма введенных чисел лежит за пределами от 10 до 20");
            return false;
        }
    }
    /*
    2. Написать метод, которому в качестве параметра передается целое число.
    Метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    public static void checkNumberSign1(int num) {
        if (num >= 0) {
            System.out.println("Введено целое положительное число");
        } else {
            System.out.println("Введено целое отрицательное число");
        }
    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    Замечание: ноль считаем положительным числом.
     */
    public static boolean checkNumberSign2(int num) {
        return num >= 0 ? true : false;
    }

    /*
    4.Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз.
     */
    public static void printStringNTimes(String text, int count) {
        for (int i = 1; i <= count; i++)
            System.out.println(text);
    }

    /*
     *Написать метод, который определяет, является ли год високосным, и возвращает boolean
     (високосный - true, не високосный - false)
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static int checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - высокосный год");
        } else System.out.println(year +" - не высокосный год");
        return year;
    }

    /*
    5. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void invertArray() {
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Первоначальный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }
        System.out.println("Инвертированный массив:" + Arrays.toString(array));
    }

    /*
    6. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */

    public static void fillArray() {
        int[] array = new int[100];
        System.out.println("Изначально пустой массив длиной 100: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Заполненный массив: " + Arrays.toString(array));
    }

    /*
    7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void updateArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Первоначальный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }

    /*
    8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void fillArrayDiagonal() {
        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /*
    9. * Написать метод, принимающий на вход два аргумента:
    len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */

    public static void createArray (int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println("Новый массив: " + Arrays.toString(array));
    }

    //Методы ввода данных с клавиатуры и вывода их в консоль
    public static String textInput() {
        System.out.println("Введите любой текст и нажмите Enter: ");
        String text = in.next();
        return text;
    }

    public static int numInput() {
        System.out.println("Введите любое целое число и нажмите Enter: ");
        int number = in.nextInt();
        return number;
    }

    /*
     *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
     Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     При каком n в какую сторону сдвиг можете выбирать сами.
     */
}

