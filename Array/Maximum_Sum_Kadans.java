public class Maximum_Sum_Kadans {
    public static void Kadans(int arr[]){
        int cs=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;}
            maxsum=Math.max(cs, maxsum);

            // Learn Kadans algo in copy 
}
System.out.println(maxsum);
}

    public static void main(String[] args)
{
int numbers[]={2,3,6,8};
Kadans(numbers);

    }
    }
