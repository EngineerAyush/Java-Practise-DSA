import java.util.*;
public class KthOdd_No {
    public static int OddLargest(int l,int r, int k){
        int result=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(l<=r){
           if(l%2!=0){
               arr.add(l);
           }
              l++;
        }
        if(arr.size()<k){
            result=0;
        }
        Collections.sort(arr,Collections.reverseOrder());
        result=arr.get(k-1);
        return result;
    }
    public static void main(String[] args) {
        int l=-3;
        int r=3;
        int k=2;
        System.out.println(OddLargest(l,r,k));
    }
    
}
