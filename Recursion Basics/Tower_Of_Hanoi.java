public class Tower_Of_Hanoi{
    public static void Solution(int n,String src,String hlpr,String  dest){
        if(n==1){
            System.out.println("Transfer disk from "+src+" to "+dest+"...");
            return;
        }
        Solution(n-1,src,dest,hlpr);
        System.out.println("Transfer disk from "+src+" to "+dest+"...");
        Solution(n-1, hlpr, src, dest);}

    public static void main(String[] args) {
        int n=3;
        Solution(n, "A","B","c");
    }
}