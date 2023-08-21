public class Sub_Array {
    public static void SubArray(int arr[]){
         for(int i=0;i<arr.length;i++){
            // int cur=arr[i];
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){

                    System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

public static void main(String[] args)
{
int numbers[]={2,3,6,8};
SubArray(numbers);

}
}

