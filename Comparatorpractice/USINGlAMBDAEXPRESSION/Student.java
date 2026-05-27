package Comparatorpractice.USINGlAMBDAEXPRESSION;

public class Student {
    private int id;
    private String name;
    private int age;
    Student(int id,String name,int age){
        this.age=age;
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return name+" "+id;
    }
}
