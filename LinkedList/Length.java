package LinkedList;

public class Length {
    public static int Length(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;

    }
    // public static void display(Node head){
    //     Node temp = head;
    //     while(temp != null){
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    // }
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

        // display(a);
        // System.out.println();
        System.out.println("Length of Linked List is: " + Length(a));

    }
    
}
