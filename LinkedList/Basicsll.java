package LinkedList;

public class Basicsll{
    public static void insertAtEnd(Node head , int data){
        Node temp = new Node(data);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
}
    //print the linkedlist in reverse order by using recursion
    public static void displayReverse(Node head){
        if(head==null) return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
        
    }
    //display recursively the Linkedlist
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
       //display the linkedlist
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;   //value
        Node next;   //address of next node

        Node(int data){
        this.data = data;
        this.next = null;
        }
        
    }
    

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        //5->10->15->20->25
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Node temp = a;
        // while(temp != null){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        
        // display(a);
        // System.out.println();
        // displayr(a);
        // System.out.println();
        // displayReverse(a);

        insertAtEnd(a,87);
        display(a);
        
    }
}