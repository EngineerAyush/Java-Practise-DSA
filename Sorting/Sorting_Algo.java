public class Sorting_Algo {
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(arr[i],largest);
    }
    int count[]=new int[largest+1];
    for(int i=0; i<arr.length; i++){
        // Counting The Frequency of the array element
        count[arr[i]]++;
    }
    //Sorting
    int j=0;
    for(int i=0; i<count.length; i++){
        if(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }

    // For Descending Order 
    // for(int i=count.length-1; i>=0; i++){
    //     if(count[i]>0){
    //         arr[j]=i;
    //         j++;
    //         count[i]--;
    //     }
    // }

}
public static void PrintArray(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
}
System.out.println();
}
public static void BubbleSort(int arr[]){
    
    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1-i; j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }
        

    }}
}
public static void SelectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        int small=i;
        for(int j=i+1;j<arr.length;j++ ){
            if(arr[j]<arr[small]){
                small=j;
            }
        }
        int temp=arr[small];
        arr[small]=arr[i];
        arr[i]=temp;

    }
}
public static void Insertion(int arr[]){
    for(int i=0; i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]>curr){
            // For Descending arr[prev]<curr 
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
    }
}
public static void OptimisedBubleSort(int arr[]){
     for(int i=0; i<arr.length-1; i++){
        boolean swap=false;
        for(int j=0; j<arr.length-1-i; j++){
        if(arr[j]>arr[j+1]){
            
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
            swap=true;
        }}
        if(swap==false){
            break;
        }}}

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        OptimisedBubleSort(arr);
        PrintArray(arr);

    }
}
