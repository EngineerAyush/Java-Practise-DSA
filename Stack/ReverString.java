import java.util.*;
public class ReverString {
    public static String Rev(String str){
        Stack<Character> stack = new Stack<Character>();
        int indx=0;
        while(indx<str.length()){
            stack.push(str.charAt(indx));
            indx++;}
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            char c=stack.pop();
            sb.append(c);

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="abcd";
        String result=Rev(str);
        System.out.println(result);
    }
    
}
