import java.util.ArrayList;

public class LCAApproch1 {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean getpath(Node root, int n1,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        if(root.val==n1){
            return true;
        }
        path.add(root);
        boolean leftval=getpath(root.left, n1, path);
        boolean rightval=getpath(root.right, n1, path);
        if(leftval|| rightval){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node l1=path1.get(i-1);
        return l1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(lca(root, 2, 3).val);
        
    }
    
}
