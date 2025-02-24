public class RemoveDuplicatesFromSortedLinkedList {
    class ListNode {
        int data;
        ListNode next;
        
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void removeDuplicates(ListNode head){
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
    public void display(ListNode head) {
        ListNode temp = head;
        if(head==null) return;
        
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode insert(ListNode head, int data) {
        if (head == null) return new ListNode(data);
        
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(data);
        return head;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedLinkedList list = new RemoveDuplicatesFromSortedLinkedList();
        
        ListNode head = list.insert(null, 1);
        head = list.insert(head, 1);
        head = list.insert(head, 2);
        head = list.insert(head, 3);
        head = list.insert(head, 3);
        head = list.insert(head, 4);

        System.out.println("Before removing duplicates:");
        list.display(head);

        // Removing duplicates
        list.removeDuplicates(head);

        System.out.println("After removing duplicates:");
        list.display(head);
    }
}




