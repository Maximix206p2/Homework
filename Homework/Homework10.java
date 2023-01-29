
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Random;

public class Homework10 {
    public static void main(String[] args) throws FileNotFoundException {
        //task6
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
    public void read() throws IOException{
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
