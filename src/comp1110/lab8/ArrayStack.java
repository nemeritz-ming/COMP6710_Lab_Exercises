package comp1110.lab8;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
    private static final int INITIAL_SIZE = 2;
    private static final float GROWTH_FACTOR = 1.5f;

    int topIndex = 0;
    private T[] values = (T[]) new Object[INITIAL_SIZE];

    @Override
    public boolean isEmpty() {
        return topIndex == 0;
    }

    @Override
    public void push(T value) {
        if (topIndex == values.length - 1) {
            // potential error - out of space
            T[] newValues = (T[]) new Object[(int) Math.ceil(values.length * GROWTH_FACTOR)];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }
        values[topIndex++] = value; // potential error - failure to maintain index
    }

    @Override
    public T pop() {
        if (topIndex == 0) {
            // potential error - exception if empty
            throw new EmptyStackException();
        }
        T result = values[--topIndex]; // potential error - failure to maintain index
        values[topIndex] = null; // potential error - forgetting to null out value
        return result;
    }

    @Override
    public T peek() {
        if (topIndex == 0) {
            // potential error - exception if empty
            throw new EmptyStackException();
        }
        return values[topIndex - 1]; // potential error - wrong top index
    }
}
