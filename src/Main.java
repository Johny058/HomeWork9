import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

    }
    public static void task2() {
        System.out.println("Задача 2");
        int arr[] = generateRandomArray();
        int maxArr = -1;
        int minArr = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        for (int q = 0; q < arr.length; q++) {
            if (arr[q] < minArr) {
                minArr = arr[q];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. " +
                "Максимальная сумма трат за день составила " + maxArr + " рублей");

    }

    public static void task3() {
        System.out.println("Задача 3");
                int arr[] = generateRandomArray();
        float sum = 0;
        int month = 30;
        for (float element : arr) {
            sum += element / month;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");

    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseFullName[3] = 'n';
        reverseFullName[2] = 'a';
        reverseFullName[1] = 'v';
        reverseFullName[0] = 'I';
        reverseFullName[4] = ' ';
        reverseFullName[10] = 'v';
        reverseFullName[9] = 'o';
        reverseFullName[8] = 'n';
        reverseFullName[7] = 'a';
        reverseFullName[6] = 'v';
        reverseFullName[5] = 'I';
                System.out.println(reverseFullName);

    }
    }

