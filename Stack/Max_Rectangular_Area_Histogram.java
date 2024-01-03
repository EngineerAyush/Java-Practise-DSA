import java.util.*;

public class Max_Rectangular_Area_Histogram {
    public static void maxArea(int arr[]){ // O(n)
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        
        // Next Smaller Right
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s.clear(); // Clear the stack before reusing it
        for(int i=0;i<arr.length;i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]= -1; // Corrected variable assignment
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // Current Area
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        System.out.println("Max area in histogram =" + maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,4};
        maxArea(arr);
    }
    
}
