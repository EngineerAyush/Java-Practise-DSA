public class Quick_Sort {
    public static void QuickSort(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int indx=Partition(arr, start, end-1);
        QuickSort(arr, start, indx);
        QuickSort(arr, indx+1, end);
    }
    public static void PrintVal(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int Partition(int[] arr, int start, int end){
        int pivot=arr[end];
        int j=start-1;
    for (int i = start; i < end; i++) {
        if(arr[i]<=pivot){
            j++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
    }
    j++;
    int temp=pivot;
    arr[end]=arr[j];
    arr[j]=temp;
    return j;
    }
    
    public static void main(String[] args) {
        int arr[]={6,3,9,5,-3,-1,2,8};
        QuickSort(arr, 0,arr.length-1);
        PrintVal(arr);
    }
    
}
