import java.util.LinkedList;

public class Add_Val {
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
public void Add_First(int data){
    Node nwNode=new Node(data);
    size++;
    if(head==null){
        head = tail = nwNode;
        return;
    }
    
    nwNode.next=head;
    head =nwNode;
}
public void Add_Last(int data){
    Node nwNode=new Node(data);
    size++;
    if(head==null){
    head =tail= nwNode;
    return;
    }
    tail.next=nwNode;
    tail=nwNode;

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
public void Add_Indx(int indx,int data){
    if(indx==0){
        Add_First(data);
        return;}
    Node nwNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<indx-1){
        temp=temp.next;
        i++;
    }
    nwNode.next= temp.next;
    temp.next=nwNode;}
    public static void main(String[] args) {
        Add_Val l1=new Add_Val();
        int a1=5;
        l1.Add_First(a1);
        l1.Add_First(2);
        l1.Add_First(1);
        l1.Add_Last(3);
        l1.Add_Indx(3, 6);
        l1.Add_Last(4);
        l1.Print_Data();
        l1.Print_Data();
        

        System.out.println(l1.size);
        

        
    }
}