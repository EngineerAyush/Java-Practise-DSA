import java.util.*;
// Given a number N. The task is to generate and print all binary numbers with decimal values from
// 1 to N.
// Sample Input 1 : N =2
// Sample Output 1 : 1 10
public class Binary {
    public static void Convert_To_Binary(int n){
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(n-->0){
            String s1=q.peek();
            q.remove();
            System.out.print(s1+" ");
            String s2=s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
public static void main(String[] args) {
    int n=4;
    Convert_To_Binary(n);
}
    
}
