package Iterator.ex_1;

import java.util.Iterator;

public class List<T>implements Iterable<T>  {
    T []list;
    int size;
    List(){
        list=(T[]) new Object [150];
         size=0;
    }
    public void add(T value){
        list[size++]=value;
    }
    public T get(int index){
        return list[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new iterableList(this);
    }

    private class iterableList<T> implements Iterator<T> {
        int index=0;
         List <T>list;
        iterableList(List<T> l) {
            this.list=l;
        }

            @Override
            public boolean hasNext () {
                return size>index;
            }

            @Override
            public T next () {
                return list.list[index++];
            }
        }
    }

