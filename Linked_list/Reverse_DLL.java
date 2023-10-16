// Reverse a Doubly Linked List 
public class Reverse_DLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;
    public void Add_First(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void Print_Data() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <--> ");
            }
            temp = temp.next;
        }
        System.out.println("<--> null");
    }
    public void Reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
public static void main(String[] args) {
    Reverse_DLL Dll=new Reverse_DLL();
    Dll.Add_First(3);
    Dll.Add_First(2);
    Dll.Add_First(1);
    Dll.Print_Data();
    Dll.Reverse();
    Dll.Print_Data();

}
}
