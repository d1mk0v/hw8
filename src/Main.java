import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
// Объявите три массива:
// Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
// Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
// Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
// с помощью ключевого слова или сразу заполненный элементами.
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);

        double[] fractions = new double[]{1.57, 7.654, 9.986};
        System.out.println(fractions[2]);

        int[] dayOfWeeks = {3, 5, 7};
        System.out.println(dayOfWeeks [2]);
    }

    public static void task2() {
        System.out.println("Задача 2");
// Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        double[] fractions = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] dayOfWeeks = {3, 5, 7};
        for (int i = 0; i < dayOfWeeks.length; i++) {
            System.out.print(dayOfWeeks[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
// Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] fractions = new double[]{1.57, 7.654, 9.986};
        for (int i = fractions.length - 1; i >= 0; i--) {
            System.out.print(fractions[i]);
            if (i >0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] dayOfWeeks = {3, 5, 7};
        for (int i = dayOfWeeks.length - 1; i >= 0; i--) {
            System.out.print(dayOfWeeks[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
// Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
//Распечатайте результат преобразования в консоль.
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}