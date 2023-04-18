package Activity33;

import java.util.LinkedList;

public class LinkedListQueue<E> {
    private LinkedList<E> list;

    public LinkedListQueue() {
        list = new LinkedList<E>();
    }

    public void enqueue(E element) {
        list.addLast(element);
    }

    public E dequeue() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.removeFirst();
        }
    }

    public E peek() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.getFirst();
        }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
