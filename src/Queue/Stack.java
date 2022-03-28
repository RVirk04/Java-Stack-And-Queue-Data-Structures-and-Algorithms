package Queue;

import java.util.NoSuchElementException;

/**
 * The generic Stack class used implements an application that
 * will execute and process the stack data.
 * Maintains Head – Points to the top node in the stack (or null if there are no nodes).
 * Maintains Size – Count of the number of nodes in the list, zero when the list is empty.
 *
 * @author Randeep Singh Virk
 * @version 1.0
 * @since 2022-02-18
 * @updated 2022-03-18
 */
public class Stack<T> implements Cloneable {

    /**
     * Private fields for size and head.
     */
    private int size;
    private Node<T> head;

    //region Methods

    /**
     * Initializes all class variables to their default values.
     */
    public Stack() {
        clear();
    }

    /**
     * Creates a new Node with the new element and adds it to the top of the stack.
     *
     * @param element The new Node element.
     */
    public void push(T element) {
        head = new Node<T>(element, head);
        size++;
    }

    /**
     * Returns the head/top element on the stack without removing it from the data structure.
     *
     * @return Returns head/top Node element in the stack.
     */
    public T top() {
        if (isEmpty()) throw new NoSuchElementException("top() not allowed on Empty Stack!");

        return head.getElement();
    }

    /**
     * Makes the previousNode to be head/top Node and returns the top element on the stack,
     * removing it from the data structure.
     *
     * @return Returns the top element on the stack, removing it from the data structure.
     */
    public T pop() {
        Node<T> temp = head;
        T data;

        if (isEmpty()) {
            throw new NoSuchElementException("pop() not allowed on Empty Stack!");
        } else {
            data = temp.getElement();
            head = temp.getNext();
        }
        size--;
        return data;
    }

    /**
     * Resets the Stack to the same condition it was in when it was first instantiated by the constructor.
     */
    public void clear() {
        this.size = 0;
        this.head = null;
    }

    /**
     * Gets the size of the stack.
     *
     * @return Returns the size of the stack.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Gets the head/top Node in the stack.
     *
     * @return Returns the head/top Node in the stack.
     */
    public Node<T> getHead() {
        return this.head;
    }

    /**
     * True if the list/stack is empty, false if the stack contains one or more Nodes.
     *
     * @return Returns true if the list/stack is empty(or size is zero).
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Create an exact copy of an object Stack.
     * Creates a new instance of the class of the current object and initializes all its fields with exactly the
     * contents of the corresponding fields of this object.
     *
     * @return Return the copy of an object.
     * @throws CloneNotSupportedException Thrown to indicate that the clone method in class Object has been called to
     *                                    clone an object, but that the object's class does not implement the Cloneable
     *                                    interface.
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //endregion
}
