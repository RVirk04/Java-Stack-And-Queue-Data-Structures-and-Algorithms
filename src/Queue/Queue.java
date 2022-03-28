package Queue;

/**
 * The generic Queue class used implements an application that
 * will execute and process the queue data.
 * Maintains Head – Points to the front node in the Queue (or null if there are no nodes).
 * Maintains Tail – Points to the last node in the Queue (or null if there are no nodes).
 * Maintains Size – Count of the number of nodes in the list, zero when the list is empty.
 *
 * @author Randeep Singh Virk
 * @version 1.0
 * @since 2022-03-18
 */
public class Queue<T>{
    /**
     * Private fields for size and head.
     */
    private Node<T> head; // Least-recently added
    private Node<T> tail; // Most-recently added
    private int size;

    //region Methods

    /**
     * Initializes all class variables to their default values.
     */
    public Queue(){ clear(); }

    /**
     * Creates a new Node with a new element and adds it to the tail of the queue.
     * The old tail will now point to the new tail.
     *
     * @param element The new element to be inserted.
     */
    public void enqueue(T element){
        Node<T> node = new Node<>(element, null);
        if (isEmpty()){
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    /**
     * Returns the front element in the queue (next to be removed) without removing it from the data structure.
     *
     * @return Returns the front element in the queue (next to be removed) without removing it from the data structure.
     */
    public T front(){
        if (isEmpty()) throw new IllegalArgumentException();

        return head.getElement();
    }

    /**
     * Returns the front element on the queue, removing it from the data structure.
     * The new Head will point to the next person in line.
     *
     * @return Returns the front element on the queue, removing it from the data structure.
     */
    public T dequeue(){
        Node<T> temp = head;
        T data;

        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        data = temp.getElement();
        head = temp.getNext();
        size--;
        if(isEmpty()){
            tail = null;
        }
        return data;
    }

    /**
     * Resets the Stack to the same condition it was in when it was first instantiated by the constructor.
     */
    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Gets the size of the queue.
     *
     * @return Returns the size of the queue.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Gets the Node at the front of the queue.
     *
     * @return Returns the Node at the front of the queue (next out).
     */
    public Node<T> getHead() {
        return this.head;
    }

    /**
     * Gets the Node at the end of the queue.
     *
     * @return Returns the Node at the end of the queue (last one in).
     */
    public Node<T> getTail() {
        return this.tail;
    }

    /**
     * Returns true if this queue is empty and false otherwise.
     *
     * @return Returns true if this queue is empty and false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    //endregion
}
