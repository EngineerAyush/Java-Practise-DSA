import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection{
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        // If the finish is not given in sorted order Then sort it by 
        int act[][]=new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=finish[i];
        }
        Arrays.sort(act,Comparator.comparingDouble(o->o[2])); //Used to sort 2d array

        int n = start.length;
        int maxActivity=1;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(0);
        for(int i=1;i<n;i++){
            if(start[i]>=finish[ans.get(ans.size()-1)]){
                ans.add(i);
                maxActivity++;
            }
        }
        System.out.println(maxActivity);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}