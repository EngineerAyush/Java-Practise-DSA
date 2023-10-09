public class Remove_Cycle {
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
        public static boolean IsCycle(){
            Node slow=head;
            Node fast=head;
            while(fast!=null&& fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }
        public static void RemoveCycle(){
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while(fast!=null&& fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    cycle=true;
                    break;
                }
            }
            if(cycle==false){
                return;
            }
            Node prev=null;
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                prev=fast;
                fast = fast.next;

            }
            prev.next=null;
        }
        public static void main(String[] args) {
            head=new Node(1);
            Node temp=new Node(5);
            head.next=temp;
            head.next.next=new Node(2);
            head.next.next.next=temp;
            System.out.println(IsCycle());
            RemoveCycle();
            System.out.println(IsCycle());
        }
        
    }
    
