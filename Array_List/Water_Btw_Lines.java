import java.util.*;
public class Water_Btw_Lines {
    // 2 Pointer Approach Time Complexity =O(n); 
    public static int Max_WaterBruteForce(ArrayList<Integer> line){
        int max_Water=0;
       int lp=0;
       int rp=line.size()-1;
       while(lp<rp){
        int ht=Math.min(line.get(lp),line.get(rp));
        int wt=rp-lp;
        int wtr_store=ht*wt;
        max_Water=Math.max(max_Water,wtr_store);
        if(line.get(lp)<line.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
       }
        return max_Water;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lines = new ArrayList<Integer>();
        lines.add(1);
        lines.add(8);
        lines.add(6);
        lines.add(2);
        lines.add(5);
        lines.add(4);
        lines.add(8);
        lines.add(3);
        lines.add(7);
       System.out.println( Max_WaterBruteForce(lines));

    }
    
}
