import java.util.*;
public class Zig_Zag {
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
        public void Zig_Zag(){
        // FInd Mid 
        Node slow=head;
        Node fast =head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        // Reverse 2nd Half

        Node curr=tail=mid.next;
        Node prev=null;
        Node next;
        while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
        Node lef=head;
        Node rt=prev;
    }
    }
    
    public static void main(String[] args) {
        FindNthNode l1=new FindNthNode();
        LinkedList l2=new LinkedList();
        
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);

        // int a1=5;  

        // l1.Add_Val(a1);
        // l1.Add_Val(2);
        // l1.Add_Val(1);
        // l1.Add_Val(3);
        // l1.Add_Val(6);
        // l1.Add_Val(4);
        // // System.out.println(l1.recSearch(3));
        // l1.Print_Data();  
        // l1.Remove_From_last(2);
        // l1.Print_Data();
        // System.out.println(l1.size);
        
    }
    
    
}
