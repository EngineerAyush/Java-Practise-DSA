public class MaxSubArray_BruteForce {
    public static void MAXSumOfSubArray(int arr[]){
        int currsum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int sum1=0;
            for(int k=i;k<=j;k++){
                sum1+=arr[k];
                System.out.print(arr[k] +" ");
            }
            if(currsum<sum1){
                currsum=sum1;
            }
            System.out.println(currsum);
        }
        System.out.println();
    }
    System.out.println("The Maximum "+currsum);
}

public static void main(String[] args)
{
int numbers[]={2,3,6,8};
MAXSumOfSubArray(numbers);

    }
    };
