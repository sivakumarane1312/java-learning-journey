package ComparablePractice.Library;

import ComparablePractice.Employee.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Libraray b1=new Libraray(1,"deepwork");
        Libraray b2=new Libraray(1,"goodhuman");
        Libraray b3=new Libraray(1,"humansnature");
        Libraray b4=new Libraray(1,"atomichabits");
        ArrayList<Libraray> arr=new ArrayList<>();
        arr.add(b1);
        arr.add(b2);
        arr.add(b3);
        arr.add(b4);
        // here we are comparing the strings strings are compared using ascii value.String is non primitive so string class itself implents the comparable interfacte so we don need to convert the string into the code and comapare we just need to call the comapre method with the parameter which is insie the string class so that overridden method will automatically compares and send it to here this will compare and sort
        Collections.sort(arr);
        System.out.println(arr);
    }
}
