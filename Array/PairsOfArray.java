public class PairsOfArray {
    public static void Pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ cur+ "," + arr[j]+") ");
            }
            System.out.println();
        }
    }

public static void main(String[] args)
{
int numbers[]={2,3,6,8};
Pairs(numbers);

}
}
    

