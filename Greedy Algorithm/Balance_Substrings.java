public class Balance_Substrings {
    public static int  Balanced(String s1){
        int l=0,r=0;
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='L'){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                count++;
            }
            }
            return count;
        }
    public static void main(String[] args) {
        String s1="LLLRRR";
        int s0=Balanced(s1);
        System.out.println(s0);
    }
    
}
