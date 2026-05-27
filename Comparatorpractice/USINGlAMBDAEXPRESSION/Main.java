package Comparatorpractice.USINGlAMBDAEXPRESSION;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(4,"siva",19));
        students.add(new Student(2,"shaun",20));
        students.add(new Student(3,"siva",21));

//        Collections.sort(students,(s1,s2)->s1.getName().compareTo(s2.getName()) );
//        System.out.println(students);
//        Collections.sort( students,(s1,s2)->s1.getId()- s2.getId());
//        System.out.println(students);
        Collections.sort( students,(s1,s2)-> {
            if(s1.getName().equals(s2.getName())){
                return s1.getId()-s2.getId();
            }
            return s1.getName().compareTo(s2.getName());
        });
        System.out.println(students);



    }
}
