package ComparablePractice.Student;

import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Student siva=new Student(59,1);
      Student shaun=new Student(53,2);
        Student siv=new Student(54,3);
        ArrayList<Student>arr=new ArrayList<>();
        arr.add(siva);
        arr.add(shaun);
        arr.add(siv);
        Collections.sort(arr);
        System.out.println(arr);


    }
}