package ComparablePractice.Library;

public class Libraray implements Comparable<Libraray> {
    private String book;
    private int bookId;
    Libraray(int id,String name){
        this.bookId=id;
        this.book=name;
    }
    public int compareTo(Libraray r){
        return this.book.compareTo(r.book);
    }
    public String toString(){
        return(book);
    }

}
