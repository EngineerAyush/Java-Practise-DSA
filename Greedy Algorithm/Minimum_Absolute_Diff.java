import java.util.Arrays;

public class Minimum_Absolute_Diff{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int [] arr2 = {2,1,3};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int minDiff=0;
        for(int i = 0; i < arr.length; i++){
            minDiff+=Math.abs(arr[i]-arr2[i]);
    }
    System.out.println(minDiff);
    }
}