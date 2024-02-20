public class Diameter2 {
        static class Node{
            int data;
            Node left;
            Node right;
            public Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
            static class Info{
                int ht;
                int diag;
                public Info(int ht,int diag){
                    this.ht=ht;
                    this.diag=diag;
                }
            }
            public static Info Diameter(Node root){
                if(root==null){
                    return new Info(0,0);
                }
                Info leftInfo=Diameter(root.left);
                Info rightInfo=Diameter(root.right);
                int diag=Math.max(leftInfo.ht+rightInfo.ht+1, Math.max(leftInfo.diag, rightInfo.diag));
                int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
                return new Info(ht, diag);
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
            System.out.println("Diameter of the tree is: "+Node.Diameter(root).diag);
        }
}
