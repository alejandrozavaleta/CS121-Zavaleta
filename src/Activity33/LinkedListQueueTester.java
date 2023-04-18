package Activity33;

public class LinkedListQueueTester {
    public static void main(String[] args) {
        // Create an instance of LinkedListQueue class
        LinkedListQueue<String> queue = new LinkedListQueue<String>();

        // Step 1
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        System.out.println(queue.peek()); // Tom
        System.out.println(queue.dequeue()); // Tom
        System.out.println(queue.peek()); // Jane

        // Step 2
        queue.enqueue("John");
        queue.enqueue("Mary");
        System.out.println(queue.peek()); // Jane
        System.out.println(queue.size()); // 4

        // Step 3
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.size()); // 4
        System.out.println(queue.peek()); // Jane
        System.out.println(queue.dequeue()); // Jane

        // Step 4
        System.out.println(queue.peek()); // Beth
        System.out.println(queue.dequeue()); // Beth
        System.out.println(queue.peek()); // John
        System.out.println(queue.dequeue()); // John
        System.out.println(queue.peek()); // Mary
        System.out.println(queue.dequeue()); // Mary

        // Step 5
        System.out.println(queue.isEmpty()); // true
        System.out.println(queue.size()); // 0
        System.out.println(queue.peek()); // null
    }
}
