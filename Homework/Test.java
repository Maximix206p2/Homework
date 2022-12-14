import java.util.*;

/*
Студенты нескольких групп сдают экзамен по одному предмету, который оценивается по шкале от 1 до 10.
Вывести список студентов и их оценок для выбранной группы с сортировкой по фамилиям; по оценкам.
После списка группы вывести статистику (количество студентов, получивших 10 баллов, 9 баллов и т.д.;
среднюю успеваемость по выбранной группе).
 */
public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Mark", 7);
        Student st2 = new Student("Alex", 9);
        Student st3 = new Student("Ritta", 9);
        Student st4 = new Student("Betty", 10);
        Student st5 = new Student("Howard", 8);
        List studentList = Arrays.asList(st1,st2,st3,st4,st5);

        //Сортировка по имени
        Collections.sort(studentList);
        for (int i = 0; i<studentList.size(); i++)
            System.out.println(studentList.get(i));

        System.out.println();

        //Сортировка по оценке
        Collections.sort(studentList, new ComparatorByMarks().reversed());
        for (int i = 0; i<studentList.size(); i++)
            System.out.println(studentList.get(i));
    }
}
class Student implements Comparable<Student>{
    private String name;
    private Integer mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " " + mark;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }
}

class ComparatorByMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getMark(), o2.getMark());
    }
}
