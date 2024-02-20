
public class CountNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int CountNodes(Node root){
        if(root==null){
            return 0;
        }
        int l=CountNodes(root.left);
        int r=CountNodes(root.right);
        return l+r+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println("Number of nodes in the tree is: "+CountNodes(root));
    }
    
}
