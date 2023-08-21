
public class Recursion_Number {
    public static void printDec(int value) {
        if (value==1){
            System.out.println(value);
            return;
        }
            System.out.print(value+" ");
            printInc(value-1);
        }
        private static void printInc(int value) {
            if (value==1){
            System.out.println(value);
            return;
        }
            printInc(value-1);
            System.out.println(value+" ");
        }       
public static void main(String[] args) {
    int i=10;
    printInc(i);
}
    
}