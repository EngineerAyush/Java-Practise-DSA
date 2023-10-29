public class DeleteNodes {
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
    public Node DeleteVal( int M, int N,Node haed) {
        Node current = head;
        Node temp = null;

        while (current != null) {
            int m = M;
            int n = N;

            // Retain M nodes
            while (m > 1 && current != null) {
                current = current.next;
                m--;
            }

            if (current == null) {
                break; // No more nodes to retain
            }
            temp = current.next;
            while (n > 0 && temp != null) {
                temp = temp.next;
                n--;
            }
            current.next = temp;
            current = temp;
        }

        return head;
    }
    
    
    public static void main(String[] args) {
        DeleteNodes list=new DeleteNodes();
        list.Add_Val(10);
        list.Add_Val(9);
        list.Add_Val(8);
        list.Add_Val(7);
        list.Add_Val(6);
        list.Add_Val(5);
        list.Add_Val(4);
        list.Add_Val(3);
        list.Add_Val(2);
        list.Add_Val(1);
        list.Print_Data();
       list.head=list.DeleteVal(3,2,head);
       list.Print_Data();

    }
}
