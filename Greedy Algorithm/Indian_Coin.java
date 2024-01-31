public class Indian_Coin {
    public static void main(String[] args) {
        int[] arr = {1,2,5,10,20,50,100,200,500,2000};
        int amount = 40;
        int n = arr.length;
        int len=0;
        for(int i = n-1; i >= 0; i--){
            if(arr[i]<=amount){

                amount=amount-arr[i];
                len++;
            }
            else{
                continue;
            }

            
    }
    System.out.println(len);
    
}}
