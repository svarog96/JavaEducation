package popularException;

import java.util.*;

/**
 * Created by glebus on 03.08.17.
 */
public class UnsupportedOperationException {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(new ArrayList<>());
        list.add("Hellow");
    }
}
class MyList implements List{

    @Override
    public int size() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean add(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object get(int index) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object set(int index, Object element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void add(int index, Object element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object remove(int index) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new java.lang.UnsupportedOperationException();
    }
}
