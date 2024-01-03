import java.util.Stack;
public class NextGreaterEle {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<Integer>();
        int GreaterEle[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                GreaterEle[i] = -1;
            } else {
                GreaterEle[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < GreaterEle.length; i++) {
            System.out.print(GreaterEle[i]+" ");
        }
    }
}
