package AndersList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AndersList<T> extends AbstractAndersList {

    T t;

    T[] list = (T[]) new Object[0];


    @Override
    public void add(Object o) {
        int currentLength = this.size();
        list = Arrays.copyOf(list, currentLength + 1);
        try {
            list[currentLength] = (T) o;
        } catch(Exception exception) {
            throw(exception);
        }
    }

    @Override
    public void remove(int index) {
        // delete the element in the index
        // index can't be empty so everything proceeding should be moved one index to the left.
        if (index >= list.length) {
            System.out.println("Index out of bounds");
        } else {
            T[] newList = (T[]) new Object[list.length-1];
            for (int i = 0; i < list.length; i++) {
                if (i < index) {
                    newList[i] = list[i];
                } else if (i > index) {
                    newList[i-1] = list[i];
                }
            }
            list = newList;
        }
    }

    @Override
    public void set(int index, Object element) {
        list[index] = (T) element;
    }

    @Override
    public void clear() {
        list = (T[]) new Object[0];
    }

    @Override
    public boolean isEmpty() {
        return list.length == 0;
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public boolean contains(Object o) {
        // todo
        // create a loop, return true INSIDE the loop if the element has been found
        // remember to use .equals (because it's an object)
        return false;
    }

    @Override
    public Object get(int index) {
        // todo
        // get the element from index
        return null;
    }

    public String toString() {
        return Arrays.toString(list);
    }
}
