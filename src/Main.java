import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        task_1(arr);
        task_2(arr);
        task_3(arr);
        task_4();
        //hard tasks
        task_5(3); //argument is a size of matrix
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        task_6(array);
        task_7(array);
        task_8(-2, array);
        task_9(-2, array);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task_1(int[] arr) {
        System.out.println("Задание 1");
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", sum);
        System.out.println("***\n");
    }

    public static void task_2(int[] arr) {
        System.out.println("Задание 2");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j <= min) min = j;
            if (j >= max) max = j;
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей.\n", min, max);
        System.out.println("***\n");
    }

    public static void task_3(int[] arr) {
        System.out.println("Задание 3");
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        float result = (float) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", result);
        System.out.println("***\n");
    }

    public static void task_4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i == 0) System.out.println("\n");
        }
        System.out.println("***\n");
    }

    public static void task_5(int i) {
        System.out.println("Задание 5");
        int[][] matrix = new int[i][i];
        for (int j = 0; j < i; j++) {
            matrix[j][j] = 1;
            matrix[i - 1 - j][j] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("***\n");
    }

    public static void task_6(int[] array) {
        System.out.println("Задание 6");
        System.out.println(Arrays.toString(array));
        int[] tmp = array.clone();
        for (int i = 0; i < array.length; i++) {
            array[i] = tmp[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("***\n");
    }

    public static void task_7(int[] array) {
        System.out.println("Задание 7");
        System.out.println(Arrays.toString(array));
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("***\n");
    }

    public static void task_8(int k, int[] array) {
        /*
        Не представляю как еще можно решить эту задачу, и как тут может помочь сортировка.
        Буду очень признателен если пришлете мне вариант решения с сортировкой Arrays.sort(arr)
         */
        System.out.println("Задание 8");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    System.out.printf("Элемент массива №%d и элемент масива №%d в сумме дают значение %d.\n", i, j, k);
                    System.out.println("***\n");
                    return;
                }
            }
        }
    }

    public static void task_9(int k, int[] array) {
        System.out.println("Задание 9");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k)
                    System.out.printf("Элемент массива №%d и элемент масива №%d в сумме дают значение %d.\n", i, j, k);
            }
        }
        System.out.println("***\n");
    }
}