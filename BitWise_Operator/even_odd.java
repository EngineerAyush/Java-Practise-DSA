import java.util.Scanner;
public  class even_odd{
    public static int Find_Bit(int x, int y) {
        int a1 = (1 << y);
        if ((x & a1) != 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int Power_Number(int x, int y) {
    int ans=1;
        while (y>0) {
            if((y & 1)!=0){
        ans=ans*x;
    }
    x=x*x;
    y=y>>1;
}
return ans;
}
    
    public static int Helo(int x){
        int a2=x&1;
        if(a2==1){
            System.out.println("Odd Number");

        }
        else{
            System.out.println("Even Number");
        }
        return a2;
    }
    public static int set_Bit(int x, int y){
        int a1=1<<y;
        return (x | a1);
    }
    public static int Clear_Bit(int x, int y){
        int a1=~(1<<y);
        return (x&a1);
    }
    public static int Clear_Range_OfBits(int x, int i,int j){
        int a=((~0)<<(j+1));
        int b=1<<(i-1);
        int bitmask=a|b;
        return x&bitmask;
    }
   public static int Set_BitsTotal(int x) {
    int count = 0;
    while (x > 0) {
        if ((x & 1) == 1) {  // Corrected the condition to compare with 1
            count++;
        }
        x = x >> 1;
    }
    return count;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a1=sc.nextInt();
        int a1=Power_Number(5,2);
        System.out.println(a1);


        
    }
};