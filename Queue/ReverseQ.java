import java.util.*;
public class ReverseQ {
    public static void Reverse(Queue<Integer> Q){
        Stack<Integer> S=new Stack<>();
        while(!Q.isEmpty()){
            S.push(Q.remove());
        }
        while(!S.isEmpty()){
            Q.add(S.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Reverse(Q);
        System.out.println(Q);
        
    }
    
}
