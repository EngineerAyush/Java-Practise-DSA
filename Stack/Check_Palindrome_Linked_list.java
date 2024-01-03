// import java.util.LinkedList;

import java.util.*;

public class Check_Palindrome_Linked_list {
    public static void Check_Palindrome(LinkedList<Character> ll){
        int i=0;
        int j=ll.size()-1;
       Stack<Character> s=new Stack<>();
         while(i<=j){
              s.push(ll.get(i));
              i++;
         }
         i=0;
            while(i<=j){
                if(s.pop()!=ll.get(i)){
                    System.out.println("Not a palindrome");
                    return;
                }
                i++;
            }
            System.out.println("Palindrome");
            return;
    }
    public static void main(String[] args) {
        LinkedList<Character> ll=new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('b');
        ll.add('A');
        Check_Palindrome(ll);
    }
    
}
