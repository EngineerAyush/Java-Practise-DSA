import java.util.*;
public class Chocola_Problem {
    public static void main(String[] args) {
        int m=6,n=4;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int hp=1,vp=1;
        int h=0,v=0;
        int cost=0;
        while(h<costVer.length && v<costHor.length){
            if(costVer[v]<=costHor[h]){
                cost+=costHor[h]*vp;
                h++;
                hp++;
        }  
        else{
            cost+=costVer[v]*hp;
            v++;
            vp++;
        }
        }
        while(h<costHor.length){
            cost+=costHor[h]*vp;
            h++;
            hp++;
        }
        while(v<costVer.length){
            cost+=costVer[v]*hp;
            v++;
            vp++;
        }
        System.out.println("Final Cost = "+cost);


        
    }
    
}
