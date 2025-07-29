package ReverseLinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseLinkedListUsingRecusion {
    public static ListNode reverseList(ListNode head){
        if(head==null || head.next==null){
        return head;
    }
    ListNode list=reverseList(head.next);
    head.next.next=head;
    head.next=null;
    return list;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead); 
    }
}
