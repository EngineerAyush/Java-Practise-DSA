import java.util.ArrayList;

public class StaticB {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean IsEmpty() {
            return list.size() == 0;
        }

        public static void Push(int data) {
            list.add(data);
        }

        public static int pop() {
            if(IsEmpty()){
                return -1;}
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1); 
            return top;
        }
        public static int Peak(){
                if(IsEmpty()){
                return -1;}
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
        while(!s.IsEmpty()){
            System.out.println(s.Peak());
            s.pop();
        }
    }
}