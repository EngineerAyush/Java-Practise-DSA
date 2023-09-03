public class RetraceArray {
    public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void CreateArr(int arr[],int i,int val){
        if(i==arr.length){
            PrintArr(arr);
            return;
        }
        arr[i]=val;
        CreateArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        CreateArr(arr,0,1);
        PrintArr(arr);
    }    
}
