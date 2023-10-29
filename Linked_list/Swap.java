public class Swap {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void Add_Val(int data){
        Node nwNode=new Node(data);
        size++;
        if(head==null){
            head = tail = nwNode;
            return;
        }
        
        nwNode.next=head;
        head =nwNode;
    }
    public void Print_Data(){
        if(head==null){
        System.out.println("The linked List is empty:");}
        Node temp = head;
    
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
    }
    System.out.println("null");}
public Node Swap(Node head,int n1,int n2){
    if(head==null|| head.next==null||n1==n2){
    return head;}
    Node prev=null;
    Node next=null;
    Node curr=head;
    
}
    public static void main(String[] args) {
        Swap node=new Swap();
        node.Add_Val(4);
        node.Add_Val(3);
        node.Add_Val(2);
        node.Add_Val(1);

        node.Print_Data();
        node.Swap(head,2,3);
        
    }
    
}
