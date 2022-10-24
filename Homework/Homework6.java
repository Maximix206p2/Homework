import java.util.Random;

public class Homework6 {
    public static void main(String[] args) {
        //task 1
        int a1 = 1, a2 = 1, count = 0;
        while (count != 15) {
            int a3 = a1 + a2;
            if (a3 % 2 == 0) {
                System.out.println(a3);
            }
            a1 = a2;
            a2 = a3;
            count++;
        }
        //task 2
        int[] arr;
        arr = new int[30];
        int min = 50, max = -70;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (50 + 70 + 1)) - 70;
            //System.out.print(arr[i] + " ");
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println(min + " " + max);
    }
}
