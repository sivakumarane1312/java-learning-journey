package Genericspracticie.ex_2;

public class Customhashmap<k,v>{
    private k key;
    private v value;
    public void put(k key,v value){
        this.key=key;
        this.value=value;
    }
    public  String  get(){
        return (key+" "+value);
    }
}
