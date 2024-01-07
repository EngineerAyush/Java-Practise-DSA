import java.util.*;
public class InterleafElement {
    public static void InterleafQ(Queue<Integer> Q){
        Queue<Integer> Q1=new LinkedList<>();
        int s=Q.size();

        // Q ka size phle se var me lelo bcz next time size change ho jayega as such wo q se value remove hogi isliye
        for(int i=0;i<s/2;i++){
            Q1.add(Q.remove());
        }
        while(!Q1.isEmpty()){
            Q.add(Q1.remove());
            Q.add(Q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        Q.add(7);
        Q.add(8);
        Q.add(9);
        Q.add(10);
        InterleafQ(Q);
        System.out.println(Q);

    }
    
}
