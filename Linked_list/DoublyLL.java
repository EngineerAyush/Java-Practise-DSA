public class DoublyLL {
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

    public int Remove_first() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

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

    public void Add_Last(int data) {
        size++;
        Node nw = new Node(data);
        if (head == null) {
            head = tail = null;
            return;
        }
        Node prev1 = head;
        for (int i = 0; i < size - 2; i++) { // Changed the loop condition
            prev1 = prev1.next;
        }
        prev1.next = nw;
        nw.next = null;
        return;

    }

    public int Remove_Last() {
        // size--;
    if (head == null) {
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }
    if (size == 1) {
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }
     Node prev1 = head;
        for (int i = 0; i < size - 2; i++) { // Changed the loop condition
            prev1 = prev1.next;
        }
    int val = prev1.data;
    prev1.next= null;
    tail=prev1;
    size--;
    return val;
}

    public static void main(String[] args) {
        DoublyLL DLL = new DoublyLL();
        DLL.Add_First(3);
        DLL.Add_First(4);
        DLL.Add_First(5);
        DLL.Add_First(8);
        DLL.Print_Data();
        System.out.println(DLL.size);
        DLL.Remove_first();
        DLL.Print_Data();
        System.out.println(DLL.size);
        DLL.Add_Last(1);
        DLL.Print_Data();
        DLL.Remove_Last();
        DLL.Print_Data();
        System.out.println(DLL.size);

    }
}
