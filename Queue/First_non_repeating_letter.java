import java.util.*;
public class First_non_repeating_letter {
    public static void Non_Repeating(String str){
        int freq[]=new int[26];
        Queue<Character> Q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            Q.add(ch);
            freq[ch-'a']++;
            while(!Q.isEmpty()&& freq[Q.peek()-'a']>1){
                Q.remove();
            }
            if(Q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(Q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="aabccxb";
        Non_Repeating(str);
    }
    
    
}
