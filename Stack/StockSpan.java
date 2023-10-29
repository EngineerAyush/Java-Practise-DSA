import java.util.*;
public class StockSpan {
    public static void SpanCheck(int stocks[],int span[]){
        Stack<Integer> s= new Stack<>();
        
    }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        int span[]=new int[arr.length];
        SpanCheck(arr,span);
        for (int i=0;i<span.length;i++){
            System.out.println(span[i]+" ");
        }
    }
}
