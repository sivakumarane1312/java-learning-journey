package ComparablePractice.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee siva=new Employee(1,"siva",500023);
        Employee pravin=new Employee(2,"pravin",10978);
        Employee saruk=new Employee(3,"saruk",24907);
        Employee shaun=new Employee(4,"shaun",50000);
        ArrayList<Employee>arr=new ArrayList<>();
        arr.add(siva);
        arr.add(pravin);
        arr.add(saruk);
        arr.add(shaun);
        //here we sorting the objects using salary the sort method internally calls the comapreto method so it will compare it and sort according to out logic
        // we are sorting it in desc order
        Collections.sort(arr);
        System.out.println(arr);
    }

}
