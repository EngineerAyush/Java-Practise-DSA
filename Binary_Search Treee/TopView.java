import java.util.*;

public class TopView {
    static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class I {
        int hz;
        Node node;

        public I(int hz, Node node) {
            this.hz = hz;
            this.node = node;
        }
    }

    public static void Tip(Node root) {
        if (root == null) {
            return;
        }
        Queue<I> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new I(0, root));
        q.add(null);
        while (!q.isEmpty()) {
            I t = q.remove();
            if (t == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(t.hz)) {
                    map.put(t.hz, t.node);
                }
                if (t.node.left != null) {
                    min = Math.min(t.hz - 1, min);
                    q.add(new I(t.hz - 1, t.node.left));
                }
                if (t.node.right != null) {
                    max = Math.max(t.hz + 1, max);
                    q.add(new I(t.hz + 1, t.node.right));
                }
            }
        }
        for (int i = min; i <= max; i++) {
            if (map.containsKey(i)) {
                System.out.print(map.get(i).data + " ");
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        Tip(root);
    }
}
