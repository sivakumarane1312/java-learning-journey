package ComparablePractice.Student;

public class Student implements Comparable<Student> {
    private int marks;
    private int id;
    Student(int marks,int id){
        this.marks=marks;
        this.id=id;
    }
    public int compareTo(Student o){
         return this.marks-o.marks;
    }
    public String toString(){
        return(id+" "+marks);
    }

}
