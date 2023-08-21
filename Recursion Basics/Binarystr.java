public class Binarystr {
    public static void Bin(int n,int last,String newstr){
        if(n==0){
            System.out.println(newstr);
            return;
        }
        Bin(n-1, 0, newstr+"0");
        if(last==0){
            Bin(n-1, 1, newstr+"1");
        }

    }
    public static void main(String[] args) {
        Bin(3, 0, "");
        
    }
    
}
