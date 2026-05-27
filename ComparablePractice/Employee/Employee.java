package ComparablePractice.Employee;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // here we are comparing the salaring and sorting it
    @Override
    public int compareTo(Employee o){
        return-(this.salary-o.salary);
    }
    public String toString(){
        return ("NAME: "+name+" SALARY"+salary);
    }
}
