public class firstOccurence {
    public static int First_Occurence(int arr[] ,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return First_Occurence(arr,key,i+1);
    }
    public static int Last_Occurence(int arr[] ,int key,int i){
        if(i==arr.length){ return -1; }
        int a1= Last_Occurence(arr,key,i+1);
        if(a1==-1&& arr[i]==key){
            return i;
        }
            return a1;
    }
    
    
    
    public static void main(String[] args) {
        int arr[] = {5,6,3,2,2,8,7,9,1,4};
        System.out.println(Last_Occurence(arr, 2,0));
        
    }
    
}
