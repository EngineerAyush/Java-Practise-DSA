public class Diagonal_Sum {
    public static void Sum_Of_Diagonal(int matrix[][]){
        int sum1=0;
        for (int i = 0; i < matrix.length; i++) {
            sum1+=matrix[i][i];
            for (int j = 0; j < matrix[0].length; j++) {
                if(i+j==matrix.length-1){
                    sum1+=matrix[i][j];
                }
                
            }
        }
        System.out.println("The sum of the diagonal is: " + sum1);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        Sum_Of_Diagonal(matrix);

    }
    
}
