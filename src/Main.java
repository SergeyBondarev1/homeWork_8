public class Main {
    public static void main(String[] args) {
        task1();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] first = new int[3];
        first[0] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(first[i]+" ");
        }
        double[] second = new double[]{1.57, 7.654, 9.986};
        second[0] = 1.57;
        for (int i = 0; i < second.length; i++) {
            System.out.println(second[i]);
        }
        int[] third = new int[5];
        third[3] = 4;
        for (int i = 0; i <= third.length; i++) {
            System.out.println(third[i]);
        }
    }
}
