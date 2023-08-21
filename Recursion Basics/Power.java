public class Power {
    public static int powerofnumber(int val,int pow){
        if(pow==1){
            return val;
        }
        if(pow>1){
        return val*powerofnumber(val, pow-1);}
        return 1;
    }
    public static int optimisePower(int val,int power){
        if(power==0){
            return 1;
        }
        int pw=optimisePower(val, power/2)*optimisePower(val, power/2);
        if(power%2!=0){
            pw= val*pw;
        }
        return pw;
    }
   public static void main(String[] args) {
    System.out.println(optimisePower(2, 5));
   }
}

