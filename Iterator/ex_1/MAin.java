package Iterator.ex_1;

import java.util.Iterator;

public class MAin {
    public static void main(String[] args) {
        List<Integer>l=new List<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Iterator<Integer>it=l.iterator();
        for(int i=0;i<l.size;i++){
            if(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
