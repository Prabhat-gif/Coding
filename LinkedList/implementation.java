package LinkedList;

public class implementation {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size =0;

    //Insert At End
    void insertAtEnd(int data){  //if tail is given-->O(1)
                             //if head is given--->O(n)
            Node temp = new Node(data);
            if(head==null){ //empty list
                head=temp;
            }
            else{   //nom-empty list
            tail.next = temp;
        }
        tail = temp;
        size++;
    }

    //Insert At Start
    void insertAtStart(int data){  //O(1)
        Node temp = new Node(data);
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{ //non-empty list
            temp.next = head;
            head = temp;
        }
        size++;
    }

    //Insert At an Index
    void insertAtIndex(int idx,int data){  //O(n)  sc-O(1)
        
        if(idx==size){
            insertAtEnd(data);
            return;
        }
        else if(idx==0){
            insertAtStart(data);
            return;
        }
        else if(idx<0 || idx >size) {
            System.out.println("Wrong index");
            return;
        }
        Node t = new Node(data);
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++;
    }
    
    //GetElement method---->O(n)
    int getAt(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Wrong index");
            return -1;
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    
    //Delete
    void deleteAt(int idx){
        if(idx==0){
            head = head.next;
            size--;
            return;
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp; //tail ki pehchan bana rha
        size--;
    }
    //display
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //length of linkedlist if only head is given ---->O(n)
    // int size(){
    //     int count = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         count++;
    //         temp = temp.next;
    //     }
    //     return count;
    // }

}
public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);  //4
        // ll.display();
        ll.insertAtEnd(5);  //4->5
        // ll.display();
        ll.insertAtEnd(12);  //4->5->12
        // ll.display();
        ll.insertAtStart(13);  //13->4->5->12
        // ll.display();
        ll.insertAtIndex(4, 10);  //13->4->5->12->10
        //ll.display();
        ll.insertAtIndex(0,100); //100->13->4->5->12->10
        ll.display();
        //System.out.println(ll.getAt(7));

        //System.out.println(ll.size); //linkedlist class is given then size is O(1).
        
        ll.deleteAt(0);
        ll.display();
        //System.out.println(ll.tail.data);
    }
    
}
