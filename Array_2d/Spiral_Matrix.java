public class Spiral_Matrix {
    public static void Find_Spriral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix.length-1;
        while(startRow<=endRow&&startCol<=endCol){
            //TopRow
            for(int i=startCol;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+ " ");
            }
            // Right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // Bottom 
            for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow){
                    break;}
                System.out.print(matrix[endRow][i]+" ");
            }
            // Left 
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startRow==endRow){
                    break;}
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Find_Spriral(matrix);

    }
    
};
