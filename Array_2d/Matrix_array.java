import java.util.*;
public class Matrix_array{

    public static void PrintArray(int mat[][]){
        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat.length;j++){
            System.out.print(mat[i][j]+ " ");
        }
        System.out.println(); 
    }
    }
    public static boolean Search(int mat[][],int key){
        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat.length;j++){
            if(mat[i][j]==key){
                System.out.println("The Key is found at"+i+j);
                return true;
            }
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
    
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] =sc.nextInt();
            }}
            for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
            System.out.print(matrix[i][j]+ " ");
        }
        System.out.println(); }

            // PrintArray(matrix);
            Search(matrix, 5);
        }
    
}