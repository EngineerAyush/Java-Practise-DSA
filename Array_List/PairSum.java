import java.util.ArrayList;

public class PairSum {
    public static boolean Sum_Exists(ArrayList<Integer> arr,int tar){
        int lp=0,rp=arr.size()-1;
        while(lp<rp){
            if(arr.get(lp)+arr.get(rp)==tar){
            return true;
            }
            if(arr.get(lp)+arr.get(rp)<tar){
                lp++;
        }
        else{
            rp--;
        }
    }
    return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> lines = new ArrayList<Integer>();
        lines.add(1);
        lines.add(2);
        lines.add(3);
        lines.add(4);
        lines.add(5);
        lines.add(6);
       System.out.println( Sum_Exists(lines,5));
    }
    
}
