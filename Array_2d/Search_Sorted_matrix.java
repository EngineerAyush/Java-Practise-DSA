public class Search_Sorted_matrix {
    public static boolean Search_Key(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;
        while(col<matrix[0].length &&row>=0){
            if(matrix[row][col]==key){
                System.out.println("The Key is found at "+row+" "+col);
                return true;
            }
            else if(matrix[row][col]>key){
                row--;
            }
            else{
                col++;
            }
            
        }
        System.out.println("The Key is not  found" );
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int key=15;
        Search_Key(matrix, key);


    }
    
}
