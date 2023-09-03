public class Permutation {
    public static void Find_Permutation(String str,String ans){
        if(str.length()==0) {
            System.out.println(ans);
        }
        // Time O(n*n! )
        for (int i = 0; i < str.length(); i++) {
            char st1 = str.charAt(i);  // Get a character from the original string
            String nwstr=str.substring(0, i)+str.substring(i+1);
            Find_Permutation(nwstr,ans+st1);

        }

    }
    public static void main(String[] args) {
        String str="abc";
        Find_Permutation(str, "");
    }
    
}
