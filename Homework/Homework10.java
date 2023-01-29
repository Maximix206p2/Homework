
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Random;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) throws FileNotFoundException {
        //task 1
        Random rand1 = new Random();
        Random rand2 = new Random();
        int numb = 0;
        int count = rand2.nextInt(1, 10);
        System.out.println(count);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        int finish;
        for (int i = 0; i < count; i++) {
            numb = rand1.nextInt(-10, 10);
            try {
                System.out.printf("%d / %d = ", number, numb);
                finish = number / numb;
                System.out.print(finish);
                System.out.println();
            } catch (Exception e) {
                System.out.println("division by zero exception");
            }
        }

        //task 6
        XmlReader[] xmlReaders = new XmlReader[5];
        for (int i = 0; i < 5; i++)
            xmlReaders[i] = new XmlReader();
        runner(xmlReaders);
    }

    public static void runner(XmlReader[] xmlReaders) throws FileNotFoundException {
        for (XmlReader xmlReader : xmlReaders) {
            try {
                xmlReader.read();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (FileSystemAlreadyExistsException e) {
                throw new FileNotFoundException();
            }
        }
    }
}

class XmlReader {
    private static final Random random = new Random();

    public void read() throws IOException {
        switch (random.nextInt(3)) {
            case 1:
                throw new NullPointerException();
            case 2:
                throw new Error();
            case 3:
                throw new FileNotFoundException();
            default:
                throw new FileSystemAlreadyExistsException();
        }
    }
}
