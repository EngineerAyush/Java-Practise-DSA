public class Diameter1{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public static int Height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=Height(root.left);
            int rightHeight=Height(root.right);
            return Math.max(leftHeight, rightHeight) +1;
        }
        public static int Diameter(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=Height(root.left);
            int rightHeight=Height(root.right);
            int leftDiameter=Diameter(root.left);
            int rightDiameter=Diameter(root.right);
            return Math.max(leftHeight+rightHeight+1, Math.max(leftDiameter, rightDiameter));
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);  
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("Diameter of the tree is: "+Node.Diameter(root));
    }
}