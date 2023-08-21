public class Prefix_Sum_Arry {
    public static void MAXSumOfSubArray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++) {
            prefix[i]=prefix[i-1]+arr[i];}
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
            if(maxsum<currsum){
                maxsum=currsum;
            }
            System.out.println(maxsum);
        }
        // System.out.println();
    }
    System.out.println("The Maximum "+maxsum);
}

public static void main(String[] args)
{
int numbers[]={2,3,6,8};
MAXSumOfSubArray(numbers);

    }
    }

    

