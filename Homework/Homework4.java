import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int a1 = 1, a2 = 1;
        while (a1 + a2 < 10_000_000) {
            int a3 = a1 + a2;
            System.out.println(a3);
            a1 = a2;
            a2 = a3;
        }
        //2
        boolean check;
        for (int i = 2; i < 1000; i++) {
            check = true;
            // проверить, делится ли число без остатка
            for (int j = 2; j <= i / j; j++)
                // если число делится без остатка, значит, оно не простое
                if (i % j == 0) check = false;
            if (check)
                System.out.println(i);
        }
        //3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String xL = sc.nextLine();
        int l = xL.length(), i = 1;
        int xN = Integer.parseInt(xL);
        boolean palin = true;
        for (; xN != 0 && i != l; i++, l--) {
            int x1 = xN % 10, x2 = (int) (xN / Math.pow(10, l-i));
            int ch2 = x1 - x2;
            //System.out.printf("%d - %d = %d", x1, x2, ch2);
            xN = (int) (xN  % Math.pow(10, l-i) / 10);
            //System.out.println();
            //System.out.println(xN);
            if (ch2 != 0) {
                palin = false;
                break;
            } else palin = true;
        }
        if (palin) System.out.println("YES");
        else System.out.println("NO");
    }
}
