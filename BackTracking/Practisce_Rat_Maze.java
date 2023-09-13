public class Practisce_Rat_Maze{
    public static void printSol(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int arr[][], int i, int j) {
        return (i >= 0 && i < arr.length && j >= 0 && j < arr[i].length && arr[i][j] == 1);
    }

    public static void Solve_Rat_Maze(int arr[][]) {
        int n = arr.length;
        int sol[][] = new int[n][n];
        if (mazeFinalSol(arr, 0, 0, sol) == false) {
            System.out.println("No Solution");
        } else {
            printSol(sol);
        }
    }

    public static boolean mazeFinalSol(int arr[][], int i, int j, int sol[][]) {
        if (i == arr.length - 1 && j == arr[i].length - 1 && arr[i][j] == 1) {
            sol[i][j] = 1;
            return true;
        }

        if (isSafe(arr, i, j)) {
            sol[i][j] = 1;

            if (mazeFinalSol(arr, i + 1, j, sol) || mazeFinalSol(arr, i, j + 1, sol)) {
                return true;
            }

            sol[i][j] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        Solve_Rat_Maze(maze);
    }
}
