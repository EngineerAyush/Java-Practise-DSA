public class Search_Val {
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
       public static int Find_Key(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;
            if(temp.data==key){
                return i;
       }
    }
    return -1;
}
public static int helper(int key,Node head){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int ind=helper(key, head.next);
    if(ind==-1){
        return -1;
}
    return ind+1;
}
public static int recSearch(int key){
    return helper(key,head);

}

        public static void main(String[] args) {
            Search_Val l1=new Search_Val();
            int a1=5;
            l1.Add_Val(a1);
            l1.Add_Val(2);
            l1.Add_Val(1);
            l1.Add_Val(3);
            l1.Add_Val(6);
            l1.Add_Val(4);
            System.out.println(l1.recSearch(3));
            l1.Print_Data();  
    
            System.out.println(l1.size);
            
        }
    
}


