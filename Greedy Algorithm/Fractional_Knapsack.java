import java.util.*;
public class Fractional_Knapsack {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;
        int n = value.length;
        double ratio[][]=new double[n][3];
        for (int i = 0; i < n; i++) {
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];

        } 
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int finalans=0;
        for(int i=ratio.length-1;i>=0;i--){
            int indx=(int)ratio[i][0];
            if(capacity>=weight[indx]){
                finalans+=value[indx];
                capacity-=weight[indx];
        }
        else{
            finalans+=capacity*ratio[i][1];
            capacity=0;
            break;
        }
    }
    System.out.println("Maximum Profit is: "+finalans);
}
}
