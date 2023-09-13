public class KnightsTraverse {
    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(sudoku[i][j] + " "); // Use print instead of println to print in the same line
            }
            System.out.println();
        }
    }
    public static boolean CanMove(int sudoku[][],int i,int j){
    
    }
    public static void PlaceKnights(int n){
        int val=0;
        int arr[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(CanMove(arr,i,j))
                val+=1;
                arr[i][j]=val;
            }
            
        }
    } 
    public static void main(String[] args) {
        int n=8;
        PlaceKnights(n);
    }
    
}
