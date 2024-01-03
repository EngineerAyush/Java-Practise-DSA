import java.util.Stack;
public class DublicateParanthesis {

    public static boolean IsDublicate(String s){
    Stack<Character> stack = new Stack<>();
    for(int i=0; i<s.length(); i++){
        char c= s.charAt(i);
        if(c==')'){
            int count=0;
            if(stack.peek()=='('){
                return true;
            }
            else{
                while(stack.pop()!='(' ){
                    count++;
            }}
            if(count<1){
                return true;
            }
            }
            else{
                        stack.push(c);
                    }
        }
    return false;
    }
    public static void main(String[] args) {
        String s1="((a+b))";
        String s2="((a+b)+c)";
        System.out.println(IsDublicate(s1));
    }
    
}
