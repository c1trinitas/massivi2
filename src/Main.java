import java .util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] array = generateRandomArray();
        System.out.println("Generated Array " + Arrays.toString(array));
        task1(array);
        task2(array);
        task3(array);
        task4();
    }

    public static int [] generateRandomArray () {
        java.util.Random random = new java.util.Random ();
        int [] array = new int [5];
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }
    public static void task1 (int[] array) {
        System.out.println("Task 1");
        int total = 0;
        for (int expenses : array) {
            total = total + expenses;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2 (int[] array) {
        System.out.println("Task 2");
        int minimal = Integer.MAX_VALUE;
        int maximal = Integer.MIN_VALUE;
        for (int total : array) {
            if (total < minimal) {
                minimal = total;
            }
            if (total > maximal) {
                maximal = total;
            }
        }
        System.out.println("Минимальная сумма равна " + minimal + "  рублей. А максимальная сумма равна " + maximal + " рублей");
    }

    public static void task3 (int[] array) {
        System.out.println("Task 3");
        int total  = 0;
        double mid;
        for (int salary : array) {
            total = total + salary;
        }
        mid = (double) total / array.length;
        System.out.println("Средняя сумма трат в месяц составила " + mid);
    }

    public static void task4 () {
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}