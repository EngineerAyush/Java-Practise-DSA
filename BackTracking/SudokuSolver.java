public class SudokuSolver {
    public static boolean isSafe(int arr[][], int row, int col, int digit) {
        // Column Condition
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == digit) {
                return false;
            }
        }
        // Row Condition
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == digit) {
                return false;
            }
        }
        // Grid Condition for filling the numbers
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean IsSudoku(int arr[][], int row, int col) {
        // Base Case
        if (row == 9) {
            return true;
        }
        // Recursion Case
        int nextrow = row;
        int nextcol = col + 1;
        if (nextcol == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (arr[row][col] != 0) {
            return IsSudoku(arr, nextrow, nextcol); // Return the result of the recursive call
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(arr, row, col, digit)) {
                arr[row][col] = digit;
                if (IsSudoku(arr, nextrow, nextcol)) {
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " "); // Use print instead of println to print in the same line
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (IsSudoku(sudoku, 0, 0)) {
            System.out.println("Solution Exists for Sudoku \n");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution Does Not Exist for Sudoku");
        }
    }
}
