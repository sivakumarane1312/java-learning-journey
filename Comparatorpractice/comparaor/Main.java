package Comparatorpractice.comparaor;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(4,"siva",19));
        students.add(new Student(2,"shaun",20));
        students.add(new Student(3,"dev",21));

        Collections.sort(students,new Namecomparator());
        System.out.println(students);
        Collections.sort(students,new Idcomparator());
        System.out.println(students);

    }
}
