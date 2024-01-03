import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){                //O(n)
            char c=s.charAt(i);
            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;       
                }
                else if((c==')' && stack.peek()=='(')
                || (c==']' && stack.peek()=='[') || (c=='}' && stack.peek()=='{')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="()[]{}";
        if(isValid(s)){
            System.out.println("Valid Paranthesis");
        }
        else{
            System.out.println("Invalid Paranthesis");
        }
    }
    
}


