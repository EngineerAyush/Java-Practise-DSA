public class CircularQ_Array {
 
    /**
     * This class represents a Queue data structure implemented using an array.
     */
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        /**
         * Constructs a Queue with the specified size.
         * @param n The size of the Queue.
         */
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        /**
         * Checks if the Queue is empty.
         * @return true if the Queue is empty, false otherwise.
         */
        public static boolean isEmpty() {
            return rear == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        /**
         * Adds an element to the rear of the Queue.
         * @param data The element to be added.
         */
        public static void Add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
            }
            rear = (rear + 1)%size;
            if(front==-1){
                front = 0;
            }
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
            int result=arr[front];
            
            // If Deleting Last Element 
            // O(1) 
            if(front==rear){
                rear =front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
public static void main(String[] args) {
    Queue q = new Queue(3);
    q.Add(1);
    q.Add(2);
    q.Add(3);
    System.out.println(q.Remove());
    q.Add(5);
    System.out.println(q.Remove());
    q.Add(6);
    while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.Remove();
        
    }
}
    
}
