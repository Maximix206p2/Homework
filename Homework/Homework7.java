import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        /*1 (7kata)
        Write a function called calculate that takes 3 values. The first and third values are numbers.
        The second value is a character. If the character is "+" , "-", "*", or "/",
        the function will return the result of the corresponding mathematical function on the two numbers.
        If the string is not one of the specified characters, the function should return null (throw an ArgumentException in C#).
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        String sign = sc1.nextLine();
        int y = sc.nextInt();
        switch (sign) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(y == 0 ? null : x / y);
                break;
            default:
                System.out.println("null");
                break;
        }
    }
}
