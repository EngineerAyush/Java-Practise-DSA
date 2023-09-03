public class Subset_Backtrackin {
    public static void Subset(String a1,StringBuilder ans,int i){
        if(i==a1.length()){
            System.out.println(ans);
            return;
        }
        // Yes Choice
        Subset(a1, ans.append(a1.charAt(i)), i+1);
        ans.deleteCharAt(ans.length() - 1);
        // No Choice 
        Subset(a1, ans, i+1);

    }
 public static void main(String[] args) {
    String a1="abcd";
    Subset(a1,new StringBuilder(""),0);
 }   
}
