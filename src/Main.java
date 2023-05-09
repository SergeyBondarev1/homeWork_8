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
        int[] first = new int[]{1, 2, 3};
        first[0] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(first[i]);
        }
        double[] second = new double[]{1.57, 7.654, 9.986};
        second[0] = 1.57;
        for (int i = 0; i < second.length; i++) {
            System.out.println(second[i]);
        }
        int[] third = new int[5];
        third[3] = 4;
        for (int i = 0; i < third.length; i++) {
            System.out.println(third[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] first = new int[]{1, 2, 3};
        first[0] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.print(first[i] + ", ");
        }
        System.out.println();
        double[] second = new double[]{1.57, 7.654, 9.986};
        second[0] = 1.57;
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + ", ");
        }
        System.out.println();
        int[] third = new int[5];
        third[3] = 4;
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] first = new int[]{3, 2, 1};
        first[2] = 1;
        for (int i = 0; i < 3; i++) {
            if (i == first.length - 1) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        double[] second = new double[]{9.986, 7.654, 1.57};
        second[0] = 9.986;
        for (int i = 0; i < second.length; i++) {
            if (i == second.length - 1) {
                System.out.println(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }
        {
            int[] third = new int[5];
            third[1] = 4;
            for (int i = 0; i < third.length; i++) {
                if (i == third.length - 1) {
                    System.out.println(third[i]);
                    break;
                }
                System.out.print(third[i] + ", ");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] first = new int[]{5, 2, 3};
        for (int i = 0; i < first.length; i++){
            if (first[i] % 2 != 0) {
                first[i] += 1;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}
