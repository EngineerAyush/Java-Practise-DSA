public class N_Queens {
    public static void printBoard(char str[][]){
        System.out.println("--------------------Chess_Board--------------------");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                System.out.print(str[i][j]+" ");
                
                
            }
            System.out.println();
            
        }
    }
    
    public static boolean isSafe(char str[][],int row,int col){
        // Vertical Row 
        for(int i = row-1; i >= 0; i--) {
            if(str[i][col]=='Q'){
            return false;

        }

        }
        // Vertical Left Row 
        for(int i=row-1, j=col-1;j>=0&&i>=0;j--,i--){
            if(str[i][j]=='Q'){
                return false;
            }
        }
        // Vertical Right Row 
        for(int i=row-1, j=col+1;j<str.length&&i>=0;j++,i--){
            if(str[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
public static boolean nqueens(char str[][], int row){
    if(row==str.length){
        // printBoard(str);
        count++;
        return true;
    }
    for (int j = 0; j < str.length; j++) {
        if(isSafe(str,row,j)){
            str[row][j]='Q';
            if(nqueens(str, row+1)){
                return true;
            }
            // nqueens(str, row+1);
            str[row][j]='+';

        }

    }
    return false;
}
static int count=0;
public static void main(String[] args) {
    int n=2;
    char Board[][]=new char[n][n];
    for (int i = 0; i < Board.length; i++) {
        for (int j = 0; j < Board.length; j++) {
            Board[i][j] = '+';
        }
    }
    Boolean a1=nqueens(Board,0);
    if(a1){
        System.out.println("Solution is possible!");
    }
    else{
        System.out.println("Solution is not possible!");
    }
    
    // System.out.println("Total ways to solve n_Queens is: "+count);
}
}
