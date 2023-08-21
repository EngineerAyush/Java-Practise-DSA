public class Recur_Factorial {
    public static int getFactorial(int value){
        if(value==0){
            return 1;
        }
        return value*getFactorial(value-1);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number \n");
        // int a=sc.nextInt();
        // System.out.println(a);
        int i=5;
        int a1=getFactorial(i);
        System.out.println(a1);
    }
    
}
