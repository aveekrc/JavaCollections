import java.util.*;

public class LearnHashcodeEquals {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(1, "Aveek"));
        students.add(new Student(2, "Akanksha"));
        students.add(new Student(2, "Arc"));

        System.out.println(students);

        List<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(5, "Aveek"));
        studentArrayList.add(new Student(2, "Akanksha"));
        studentArrayList.add(new Student(2, "Arc"));

        // Collections.sort(studentArrayList);
        /*Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // if positive, o1 is bigger
                // if negative, o2 is bigger
                return o1.name.compareTo(o2.name);
            }
        });*/

        Collections.sort(studentArrayList, Comparator.comparing(o -> o.name));

        System.out.println(studentArrayList);
    }
}
