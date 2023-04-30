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
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

        double[] fractions = new double[]{1.57, 7.654, 9.986};
        System.out.println(fractions[0] + ", " + fractions[1] + ", " + fractions[2]);

        int[] dayOfWeeks = {3, 5, 7};
        System.out.println(dayOfWeeks [0] + ", " + dayOfWeeks[1] + ", " + dayOfWeeks[2]);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);

        double[] fractions = new double[]{1.57, 7.654, 9.986};
        System.out.println(fractions[2] + ", " + fractions[1] + ", " + fractions[0]);

        int[] dayOfWeeks = {3, 5, 7};
        System.out.println(dayOfWeeks [2] + ", " + dayOfWeeks[1] + ", " + dayOfWeeks[0]);
    }
    public static void task4() {
        System.out.println("Задача 4");
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