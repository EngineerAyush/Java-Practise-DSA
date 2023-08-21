import java.util.Scanner;

public class True {
    public static int is_True(int value[],int target) {
        int low=0,end=value.length-1;
        while(low<=end) {
            int mid=(low+end)/2;
            if(value[mid]==target) return mid;
            if(value[low]<=value[mid]){
                if(value[low]<=target && target<=value[mid]){
                    end=mid-1;
                } 
                else{
                    low=mid+1;
                }
            }
            else if(value[low]>=value[mid]){
                if(value[mid]<=target && target<=value[end]){
                    low=mid+1;
                } 
                else{
                    end=mid+1;
                }

        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]={8,9,1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int a=is_True(arr,target);
        System.out.println(a);

    }
}
