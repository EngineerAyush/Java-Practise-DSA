public class Sample_problem {

    public static void main(String[] args) {
        int h1=0;
        int matrix[][]={{1,7,3,7},
                        {5,6,7,8},
                    {3,4,5,6}};
        int mat[][]=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                mat[j][i]=matrix[i][j];

            }}
            for (int j = 0; j < mat.length; j++) {
                for (int j2 = 0; j2 < mat[0].length; j2++) {
                    
                    System.out.print(mat[j][j2]+ " ");
                }
                System.out.println();
            }
    }
   
};
