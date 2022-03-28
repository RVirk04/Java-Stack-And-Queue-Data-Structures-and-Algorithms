package Queue;

/**
 * The Node class used implements an application that
 * will store and process the stack, and queue data.
 *
 * @author Randeep Singh Virk
 * @version 1.0
 * @since 2022-02-18
 * @updated 2022-03-18
 */
public class Node<T> {

    /**
     * Variables to store element, and nextNode.
     */
    private T element;
    private Node<T> nextNode;

    //region Methods

    /**
     * Default constructor.
     */
    public Node() { }

    /**
     * Instance constructor with one parameter element.
     *
     * @param element The element.
     */
    public Node(T element) { this.element = element; }

    /**
     * Instance constructor with two parameter.
     *
     * @param element The element in the Node.
     * @param nextNode The reference to the next Node.
     */
    public Node(T element, Node<T> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    /**
     * Gets the element.
     *
     * @return element
     */
    public T getElement() {
        return element;
    }

    /**
     * Sets the element.
     *
     * @param element Sets the element.
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Gets the nextNode.
     *
     * @return nextNode Returns the nextNode.
     */
    public Node<T> getNext() {
        return nextNode;
    }

    /**
     * Sets the nextNode.
     *
     * @param next Sets the next Node.
     */
    public void setNext(Node<T> next) {
        this.nextNode = next;
    }

    //endregion
}

