import java.util.Arrays;
public class Chain_Of_Pairs {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{15,28},{27,40},{50,90}};
        int n = pairs.length;
        Arrays.sort(pairs, (a,b) -> Integer.compare(a[0],b[0]));
        int len=1;
        int chnend=pairs[0][1];
        for(int i = 1; i < n; i++){
            if(pairs[i][0] > chnend){
                len++;
                chnend=pairs[i][1];
            }
        }
        System.out.println("Length of the longest chain of pairs: "+len);
    }
    
}
