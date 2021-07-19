package red.patterns.behavioural.iterator;

import java.util.Arrays;
import java.util.ConcurrentModificationException;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Array<T> {
    private final T[] array;

    private int modCount = 0;

    public Array() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Array(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    public void add(T obj) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = obj;
                modCount++;
                return;
            }
        }
        System.out.println("Array is full!");
    }

    public void remove(int index) {
        if (index < 0 || index > array.length)
            throw new IndexOutOfBoundsException();

        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        array[array.length - 1] = null;
        modCount++;
    }

    public T get(int index) {
        if (index < 0 || index > array.length)
            throw new IndexOutOfBoundsException();

        return array[index];
    }

    public int size() {
        return Arrays.stream(array).mapToInt(x -> x == null ? 0 : 1).sum();
    }

    public int capacity() {
        return array.length;
    }

    public Iterator<T> iterator() {
        return new GenericIterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array<?> array1 = (Array<?>) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                ", modCount=" + modCount +
                '}';
    }

    private class GenericIterator implements Iterator<T> {
        private int currentPosition = -1;
        private int localModCount = 0;

        public GenericIterator() {
            modCount = 0;
        }

        @Override
        public boolean hasNext() {
            return currentPosition + 1 < array.length;
        }

        @Override
        public T next() {
            if (modCount != localModCount)
                throw new ConcurrentModificationException();
            return array[++currentPosition];
        }

        @Override
        public void remove() {
            if (modCount != localModCount)
                throw new ConcurrentModificationException();
            modCount++;
            localModCount++;
            array[currentPosition] = null;
        }
    }
}
