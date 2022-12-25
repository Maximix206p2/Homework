import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Lists {
    public static void main(String[] args) {
        //1.ArrayList to LinkedList
        //System.out.println(generateString(3,6));
        //Упаковка
        ArrayList<LinkedList<String>> bigBox = new ArrayList<>();
        for (int i=0; i<5; i++){
            LinkedList<String> smallBox = new LinkedList<>();
            for (int j=0; j<5; j++)
                smallBox.add(generateString(3,6));
            bigBox.add(smallBox);
        }

        //Изменение элементов (3-ей маленькой коробки, 3-его элемента)
        bigBox.get(3).set(3,"elem");

        //Замена маленькой коробки
        LinkedList<String> box = new LinkedList<>();
        for (int i = 0; i<4; i++)
            box.add("bang");

        bigBox.set(2,box);

        //Распаковка
        for (LinkedList<String> smallBox:bigBox) {
            for (String s : smallBox)
                System.out.print(s + " ");
            System.out.println();
        }

        System.out.println();

        //2.ArrayList to Stack
        ArrayList<Stack<String>> bigBox2 = new ArrayList<>();
        for (int i=0; i<5; i++){
            Stack<String> smallBox2 = new Stack<>();
            for (int j=0; j<5; j++)
                smallBox2.add(generateString(3,6));
            bigBox2.add(smallBox2);
        }

        //Изменение элементов (4-ой маленькой коробки, 2-ого элемента)
        bigBox2.get(4).set(2,"Forbidden");

        //Замена маленькой коробки
        Stack<String> box2 = new Stack<>();
        for (int i = 0; i<4; i++)
            box2.add("bang");

        bigBox2.set(2,box2);

        //Распаковка
        for (Stack<String> smallBox2:bigBox2) {
            for (String s : smallBox2)
                System.out.print(s + " ");
            System.out.println();
        }
    }

    //Сгенерировать случайную строку
    public static String generateString(int minCount, int maxCount){
        Random random = new Random();
        //Получить случайное число от minCount до maxCount
        int count = random.nextInt(maxCount-minCount)+minCount;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++){
            char c = (char)(random.nextInt((int)'z'-(int)'a')+'a');
            sb.append(c);
        }
        return sb.toString();
    }
}
