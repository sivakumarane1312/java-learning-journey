package Genericspracticie.ex_1;

public class Box<T> {
   private  T data;
   public T getData(){
       return data;
   }
   public void SetData(T data){
       this.data=data;
   }
   public static <T> void print(T data){
       System.out.println(data);
   }

}
