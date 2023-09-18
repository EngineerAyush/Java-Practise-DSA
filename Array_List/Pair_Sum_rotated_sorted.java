import java.util.*;
public class Pair_Sum_rotated_sorted{
    public static boolean Find_Pair_Sum(ArrayList<Integer> lst,int tar){
        int bp=0;
        for(int i=0;i<lst.size();i++){
            if(lst.get(i)>lst.get(i+1)){
                bp=i;
                break;
            }}
        int lp=bp+1;
        int n=lst.size();
        int rp=bp;
       while(lp!=rp){
        if(lst.get(lp)+lst.get(rp)==tar){
            return true;
        }
        if(lst.get(lp)+lst.get(rp)<tar){
            lp=(lp+1)%n;
        }
        else{
            rp=(rp+n-1)%n;
        
        }
    }
    return false;
}
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int tar=100;
    System.out.println(Find_Pair_Sum(list,tar));

}
    
}