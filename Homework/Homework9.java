public class Homework9 {
    public static void main(String[] args) {
        /*pattern 22
        1 0 0 0 0
        0 2 0 0 0
        0 0 3 0 0
        0 0 0 4 0
        0 0 0 0 5
         */
        int row1 = 5; //любое число
        for (int i = 1; i <= row1; i++) {
            for (int j = 1; j <= row1 - 1; j++) {
                if (j == i)
                    System.out.print(i + " ");
                System.out.print(0 + " ");
            }
            if (row1 == i)
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println();

        /*pattern 23
        1 1 1 1 1
        1 1 1 2 2
        1 1 3 3 3
        1 4 4 4 4
        5 5 5 5 5
         */
        int row2 = 5; //любое число
        for (int i = 1; i <= row2; i++) {
            for (int j = 1; j <= row2 - i; j++)
                System.out.print(1 + " ");
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println();

        /*pattern 18
        1 2 3 4 5
         2 3 4 5
          3 4 5
           4 5
            5
            5
           4 5
          3 4 5
         2 3 4 5
        1 2 3 4 5
        */
        int row3 = 5; //любое число
        for (int i = 0; i < row3; i++) { //для первого треугольника
            for (int j = 0; j < i; j++) //для пробелов
                System.out.print(" ");
            for (int j = 1; j <= row3 - i; j++) //цифры
                System.out.print(j+i + " ");
            System.out.println();
        }
        for (int i = row3; i >= 1; i--) { //для второго треугольника
            for (int j = 0; j+1 < i; j++) //для пробелов
                System.out.print(" ");
            for (int j = 0; j <= row3-i; j++) //цифры
                System.out.print(j+i + " ");
            System.out.println();
        }
    }
}