import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        //1
        Scanner scanner0 = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week: ");
        int day = scanner0.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time: ");
        int t = scanner.nextInt();
        if (t > 6 && t <= 10) System.out.println("Bonjour!"); //(Доброе утро!)
        else if (t > 10 && t <= 18) System.out.println("Bonne après-midi!"); //(Добрый день!)
        else if (t > 18 && t <= 24) System.out.println("Bonsoir!"); //(Добрый вечер!)
        else if (t > 0 && t <= 6) System.out.println("Bonne nuit!"); //(Приятная ночь!)
        else if (t > 24) System.out.println("Êtes-vous sérieux?"); //(Are you seriously???)
        //4
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("x: ");
        int x = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("y: ");
        int y = scanner2.nextInt();
        if (x > 0 && y > 0) System.out.println("I quadrant");
        else if (x < 0 && y > 0) System.out.println("II quadrant");
        else if (x < 0 && y < 0) System.out.println("III quadrant");
        else if (x > 0 && y < 0) System.out.println("IV quadrant");
        else if (x == 0 || y == 0) System.out.println("Between quadrants");
    }
}