import java.util.*;
public class DequeMethod {
    public static void main(String[] args) {
        Deque<Integer> D=new LinkedList<>();
        D.addFirst(1);
        D.addFirst(2);
        System.out.println(D);
        D.addLast(3);
        D.addLast(4);
        System.out.println(D);
        D.removeFirst();
        System.out.println(D);
        D.removeLast();
        System.out.println(D);
        System.out.println("Element at first: "+D.getFirst());
        System.out.println("Element at last: "+D.getLast());
    }
    
}
