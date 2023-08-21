public class Remove_Dublicates {
    public static void Distinct(String mystr,int i,StringBuilder newstr,boolean map[]){
        if(i==mystr.length()){
            System.out.println(newstr);
            return;
        }
        char c=mystr.charAt(i);
        if(map[c-'a']==true){
            Distinct(mystr, i+1, newstr, map);
        }
        else{
            map[c-'a'] = true;
            Distinct(mystr, i+1, newstr.append(c), map);
        }
    }
    public static void main(String[] args) {
        String mystr ="gaminngyyaapa";
        Distinct(mystr, 0, new StringBuilder(""), new boolean[26]);

        
    }
    
}
