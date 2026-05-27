package Comparatorpractice.Anonymouscompartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(4,"siva",19));
        students.add(new Student(2,"shaun",20));
        students.add(new Student(3,"dev",21));

        Collections.sort(students,new Comparator<Student>() {
           public int compare(Student s1,Student s2){
                return s1.getName().compareTo(s2.getName());
            }
        } );
        System.out.println(students);
        Collections.sort( students,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s1.getId()-s2.getId();
            }
        });
        System.out.println(students);

    }
}
