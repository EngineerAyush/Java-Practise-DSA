import java.util.ArrayList;
import java.util.Collections;

public class Rev_Array_List {
    public static void Swap(ArrayList<Integer> list,int ind1,int ind2) {
    int temp=list.get(ind1);
    list.set(ind1,list.get(ind2));
    list.set(ind2,temp);
    }
public static void main(String[] args) {
    ArrayList<Integer> Lst = new ArrayList<Integer>();
    Lst.add(2);
    Lst.add(5);
    Lst.add(9);
    Lst.add(6);
    Lst.add(8);

    System.out.println(Lst);
    Collections.sort(Lst);
    System.out.println(Lst); //Ascending Order

    // Descending order 
    Collections.sort(Lst,Collections.reverseOrder());
    System.out.println(Lst);
//     for (int i =0; i <Lst.size(); i++) {
//         System.out.println(Lst.get(i));

//         // // if(max<Lst.get(i)){
//         // //     max=Lst.get(i);
//         // // }
//         // max=Math.max(max,Lst.get(i));
        
//     }
//     // System.out.println(max);
    
}
}