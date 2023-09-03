public class GridWays {
    public static int GridProblem(int i,int j,int n,int m){
        if(i==n-1 || j==m-1){
            return 1;
        }else if(i==n ||j==m){
            return 0;
        }
        int w1=GridProblem(i, j+1, n, m);
        int w2=GridProblem(i+1, j, n, m);
        return w1+w2;

    }
    public static void main(String[] args) {
        int n=3,m=2;
        int a1=GridProblem(0, 0, n, m);
        System.out.println(a1);
    }
}
