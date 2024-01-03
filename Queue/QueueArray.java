// Most ineficient way never used because O(n) time requires to remove an element

// Can be used in circular queue 

public class QueueArray{
    /**
     * This class represents a Queue data structure implemented using an array.
     */
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        /**
         * Constructs a Queue with the specified size.
         * @param n The size of the Queue.
         */
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        /**
         * Checks if the Queue is empty.
         * @return true if the Queue is empty, false otherwise.
         */
        public static boolean isEmpty() {
            return rear == -1;
        }

        /**
         * Adds an element to the rear of the Queue.
         * @param data The element to be added.
         */
        public static void Add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        /**
         * Removes and returns the element from the front of the Queue.
         * @return The element removed from the front of the Queue, or -1 if the Queue is empty.
         */
        public static int Remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
public static void main(String[] args) {
    Queue q = new Queue(5);
    q.Add(1);
    q.Add(2);
    q.Add(3);
    while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.Remove();
        
    }
}
}