import java.util.Stack;
public class Q_Using_2Stack {
        static class Queue{
            static Stack<Integer> s1=new Stack<>();
            static Stack<Integer> s2=new Stack<>();
            public static boolean IsEmpty(){
                return s1.isEmpty();
            }
            public static void Add(int data){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    
                }
                s1.push(data);
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                
            }
            }
            public static int remove(){
                if(s1.isEmpty()){
                    System.out.println("The given Queue Is Empty Bsdk Kuch add to kar Isme");
                }
                return s1.pop();
            }
            public static int peek(){
                if(s1.isEmpty()){
                    System.out.println("Kya Dekhoge poore khali hai Queue Matlab kuch dena hai nahi aagae dekhne Bhk");
                }
                return s1.peek();
            }
            
    }
    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.Add(1);
        q1.Add(2);
        q1.Add(3);
        System.out.println(q1.remove());
        System.out.println(q1.peek());
        
        
    }
    
}
