public class friendsPair {
    public static int Pairs(int n){
        if(n==1||n==2) return n;
        // Single 
        // int fm1=Pairs(n-1);
        // Pairs 
        // int fm2=Pairs(n-2);
        // int pairways=(n-1)*fm2;
        // TotalWays 
        // int totalways=fm1+pairways;
        return Pairs(n-1)+(n-1)*Pairs(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Pairs(3));
        
    }
}
