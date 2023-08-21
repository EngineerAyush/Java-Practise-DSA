public class Recur_Sum_ofNo {
    public static int Sum_of_n_Natural_NO(int n){
        if(n==1){
            return 1;
        }
        int sum1=0;
        sum1+=Sum_of_n_Natural_NO(n-1)+n;
        return sum1;
    }
    public static void main(String[] args) {
        int i=4;
        int a=Sum_of_n_Natural_NO(i);
        System.out.println(a);
    }
}
