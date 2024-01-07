import java.util.*;
// Implement Stack & Queue Using Deque 
public class DQ_Stack {
    static class Stack{
        Deque<Integer> D=new LinkedList<>();
        void push(int x){
            D.addLast(x);
        }
        int pop(){
            return D.removeLast();
        }
        int peek(){
            return D.getLast();
        }
        int size(){
            return D.size();
        }
    }
    static class Queue{
        Deque<Integer> D=new LinkedList<>();
        void enqueue(int x){
            D.addLast(x);
        }
        int dequeue(){
            return D.removeFirst();
        }
        int size(){
            return D.size();
        }
        int front(){
            return D.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(0);  
        System.out.println("Element at top of stack is:"+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        Queue q=new Queue();
        q.enqueue(1);   
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Element at front of queue is:"+q.front());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
