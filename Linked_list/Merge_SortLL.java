public class Merge_SortLL {
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
        public Node MidValue(Node head){
            Node slow = head;
            Node fast=head.next;
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;

        }
    return slow;
    }
    public Node Merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while (head1 != null && head2 != null) {
        if (head1.data <= head2.data) {
            temp.next = head1;
            head1 = head1.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
        }
        temp = temp.next;
    }
    while (head1 != null) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }
    while (head2 != null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return mergedLL.next;
}
    public Node Merge_sort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node mid=MidValue(head);

        Node righthead=mid.next;
        mid.next=null;
        Node leftll=Merge_sort(head);
        Node rightll=Merge_sort(righthead);
        return Merge(leftll, rightll);

    }
    
    public static void main(String[] args) {
        Merge_SortLL l1=new Merge_SortLL();
        int a1=5;
        l1.Add_Val(a1);
        l1.Add_Val(2);
        l1.Add_Val(1);
        l1.Add_Val(3);
        l1.Add_Val(6);
        l1.Add_Val(4);
        // System.out.println(l1.recSearch(3));
        l1.Print_Data();  
        l1.head=l1.Merge_sort(head);
        l1.Print_Data();
        // System.out.println(l1.size);
        
    }
        
    

}
