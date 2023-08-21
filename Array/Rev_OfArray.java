import java.util.*;
class Rev_OfArray 
{
    public static void Reverse(int arr[]) {
        int f=0,l=arr.length-1;
        while(f<l){
            int temp=arr[l];
            arr[l]=arr[f];
            arr[f]=temp;
            
            f++;
            l--;
        }
    }
public static void main(String[] args)
{
int numbers[]={2,3,6,8};
Reverse(numbers);
for(int i=0;i<=numbers.length-1;i++){
System.out.println(numbers[i]+" ");
}
System.out.println();
}
}