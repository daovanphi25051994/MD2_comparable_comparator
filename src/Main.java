import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("a", 20, "ha noi");
        Student student2 = new Student("c", 32, "ha noi");
        Student student3 = new Student("b", 41, "ha noi");
        ArrayList<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        Iterator<Student> iteratorStudent = listStudents.iterator();
        while (iteratorStudent.hasNext()) {
            System.out.println(iteratorStudent.next().toString());
        }
        System.out.println("sort by name : ");
        //   Collections.sort(listStudents,(st1, st2) -> st1.getName().compareTo(st2.getName()));
        Collections.sort(listStudents);
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
        System.out.println("sort by age : ");
        Collections.sort(listStudents, new AgeComparator());
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
