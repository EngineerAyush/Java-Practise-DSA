public class Reverse_list {
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
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
        head=prev;
    }

public static void main(String[] args) {
    Reverse_list l1=new Reverse_list();
    int a1=5;
    l1.Add_Val(a1);
    l1.Add_Val(2);
    l1.Add_Val(1);
    l1.Add_Val(3);
    l1.Add_Val(6);
    l1.Add_Val(4);
    // System.out.println(l1.recSearch(3));
    l1.Print_Data();  
    l1.reverse();
    l1.Print_Data();
    // System.out.println(l1.size);
    
}

}
    
