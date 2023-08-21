public class Tiling_Prblm {
    public static int Tiling(int n){
        if(n==0||n==1){
            return 1;
        }
        int hmm1=Tiling(n-1);
        int fm2= Tiling(n-2);
        int tw=fm2+hmm1;
        return tw;
    }
    public static void main(String[] args) {
        System.out.println(Tiling(4));
        
    }
}
