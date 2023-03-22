import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        lessons();
        task1();
        task2();
        task4();
    }

    public static void lessons() {
        System.out.println("Урок");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int weight : weights) {
            System.out.println(weight);
        }
    }

    public static void task1() {
        System.out.println("Задача 1+2");
        int[] numbers = new int[]{1, 2, 3};
        double[] numbersTwo = new double[]{1.57, 7.654, 9.986};
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int i = 0; i < numbersTwo.length; i++) {
            if (i == numbersTwo.length - 1) {
                System.out.println(numbersTwo[i]);
                break;
            }
            System.out.print(numbersTwo[i] + ", ");
        }
        for (int i = 0; i < myArray.length; i++) {
            if (i == myArray.length - 1) {
                System.out.println(myArray[i]);
                break;
            }
            System.out.print(myArray[i] + ", ");
        }
    }

    public static void task2() {
        System.out.println("Task 3");
        int[] numbers = new int[]{1, 2, 3};
        double[] numbersTwo = new double[]{1.57, 7.654, 9.986};
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ",");
        }
        for (int i = numbersTwo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbersTwo[i]);
                break;
            }
            System.out.print(numbersTwo[i] + ",");
        }
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(myArray[i]);
                break;
            }
            System.out.print(myArray[i] + ",");
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        int[] array;
        array = new int[]{1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}

