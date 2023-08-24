public class recur_Count{
    // static String digits[]={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static int count(String num,int n,int i,int j){
      if(n==1){
        return 1;
      }
      if(n<=0){
        return 0;
      }
      // AUB=A+B-A(INTERSECTION)B Using this formula we can use to find sub stirngs
      int c= count(num,n-1,i+1,j)+count(num, n-1, i, j-1)-count(num, n-2, i+1, j-1);
      if(num.charAt(i)==num.charAt(j)){
        c++;
      }
      return c;
    }
    public static void main(String[] args) {
        String s2="aba";
        int a1=s2.length();
        System.out.println(count(s2,a1,0,a1-1));
        
    }
}