public class Q_LinkedLst {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
   
    static class Queue {
        static Node head=null;
        static Node tail=null;

        /**
         * Checks if the Queue is empty.
         * @return true if the Queue is empty, false otherwise.
         */
        public static boolean isEmpty() {
            return head==null && tail==null;
        }

        /**
         * Adds an element to the rear of the Queue.
         * @param data The element to be added.
         */
        public static void Add(int data) {
           Node newNode=new Node(data);
           if (head==null) {
               head=newNode;
               tail=newNode;
           }
           tail.next=newNode;
           tail=newNode;

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
            int front = head.data; 
            if(tail==head){
                tail=head=null;
            }
            else{
                head=head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
public static void main(String[] args) {
    Queue q = new Queue();
    q.Add(1);
    q.Add(2);
    q.Add(3);
    while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.Remove();
        
    }
}
}
    
