package Genericspracticie.ex_1;

public class Main {
    public static void main(String[] args) {
        Box<Integer>b1=new Box<>();
        b1.SetData(5);
        System.out.println(b1.getData());
        Box.print(1);
        Box.print(1.1);
        Box.print("siva");
    }
}
