import java.util.*;
public class StockSpan {
    public static void SpanCheck(int stocks[],int span[]){
        Stack<Integer> s=new Stack<Integer>();
        s.push(0);
        span[0]=1;
        for(int i=1;i<stocks.length;i++){
            int currprice=stocks[i];
            while(!s.isEmpty() && currprice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        int span[]= new int[arr.length];
        SpanCheck(arr,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
    }
}
