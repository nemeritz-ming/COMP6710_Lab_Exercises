package comp1110.lab8;

import java.util.EmptyStackException;

public interface Stack<T> {
    /**
     * @return true if this stack is empty
     */
    boolean isEmpty();

    /**
     * Adds an element to the top of this stack.
     *
     * @param value
     */
    void push(T value);

    /**
     * If this stack is not empty, removes the top element.
     *
     * @return the top element of the stack
     * @throws EmptyStackException if this stack is empty
     */
    T pop();

    /**
     * If this stack is not empty, returns the top element but does not
     * remove it from the stack.
     *
     * @return the top element of the stack
     * @throws EmptyStackException if this stack is empty
     */
    T peek();
}
