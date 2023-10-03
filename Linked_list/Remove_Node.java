public class Remove_Node {
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
        public static int Remove_Val(){
            if(size==0){
                System.out.println("Linked List is empty");
                return 0;}
                else if(size==1){
                    int val=head.data;
                    head =tail=null;
                    size=0;
                    return val;}
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        public static int removeLast() {
            if (size == 0) {
                System.out.println("Linked List is empty");
                return 0;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
        
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {  // Changed the loop condition
                prev = prev.next;
            }
        
            int val = prev.data;
            prev.next = null;
            tail = prev;  // Update the tail pointer correctly
            size--;
            return val;
        }


        public static void main(String[] args) {
            Remove_Node l1=new Remove_Node();
            int a1=5;
            l1.Add_Val(a1);
            l1.Add_Val(2);
            l1.Add_Val(1);
            l1.Add_Val(3);
            l1.Add_Val(6);
            l1.Add_Val(4);
            l1.Print_Data();
            l1.Remove_Val();
        
            l1.Print_Data();
        l1.removeLast();
        l1.Print_Data();    
    
            System.out.println(l1.size);
            
        }
    
}
