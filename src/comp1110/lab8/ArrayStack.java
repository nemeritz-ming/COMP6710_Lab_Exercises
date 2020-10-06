package comp1110.lab8;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * This class represents a stack, in which elements are added and removed in a
 * last in, first out (LIFO) order. Duplicate elements are permitted.
 * When a stack is first created, it contains no elements.
 * The stack can grow to fit new elements as required.
 * Attempting to pop() or peek() an empty stack throws an EmptyStackException,
 * and does not result in any modification to the stack.
 * The Stack is implemented using an array data structure (a regular Java array),
 * and does not use any of the Java Collection classes other than
 * java.util.EmptyStackException.
 */
public class ArrayStack<T> {
    List<T> stack = new ArrayList<>();
    /**
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return stack.isEmpty();
        // FIXME complete this method
    }

    /**
     * Add the given value to this stack,
     * placing it at the top of the stack.
     *
     * @param value the value to add to this stack
     */
    public void push(T value) {
        stack.add(0,value);
        // FIXME complete this method
    }

    /**
     * Remove the value that is at the top of this stack, and return it.
     *
     * @return the value that was popped from the stack
     * @throws EmptyStackException if the stack is currently empty
     */
    public T pop() {
        if (!stack.isEmpty()){
            T popValue = stack.get(0);
            stack.remove(0);
            return popValue;}
        else {
            throw new EmptyStackException();
        }
        // FIXME complete this method
    }

    /**
     * Get the value that is currently at the top of this stack,
     * but do not remove it from the stack.
     *
     * @return the value at the top of the stack
     * @throws EmptyStackException if the stack is currently empty
     */
    public T peek() {
        if (!stack.isEmpty()){
            return stack.get(0);
        }
        // FIXME complete this method
        else{
            throw new EmptyStackException();
        }
    }

    /**
     * Check whether a given value is contained in this stack.
     * Specifically, returns true if value is not null and
     * an element e is contained in the stack such that e.equals(value).
     *
     * @param value the value to search for
     * @return true if the value is contained in this stack
     */
    public boolean contains(T value) {
        // FIXME complete this method
        return stack.contains(value);
    }

    /**
     * Create a String representation of this stack.
     * Elements on the stack are listed in order from top to bottom,
     * separated by commas (without spaces).
     * If the stack is empty, an empty string is returned.
     * For example, a stack containing the elements (from top to bottom)
     * "a", "b", and "c" would be represented as "a,b,c".
     *
     * @return a String representation of this stack
     */
    public String toString() {
        String ans = "";
        if (stack.isEmpty()){
            return ans;
        }
        else{
            for(int i =0; i< stack.size();i++){
                if (i == 0){
                    ans = ans + stack.get(i);
                }
                else {
                    ans = ans + "," + stack.get(i);
                }
            }
        }
        return ans;

        // FIXME complete this method
    }
}
