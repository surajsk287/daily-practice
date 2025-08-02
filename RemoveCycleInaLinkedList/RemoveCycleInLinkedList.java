package RemoveCycleInaLinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveCycleInLinkedList {
    public static boolean detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                removeCycle(head,slow);
                return true;
            }
        }
        return false;
    }
    private static void removeCycle(ListNode head, ListNode meetingPoint) {
        ListNode start = head;
        ListNode loopNode = meetingPoint;

        // Find the start of the cycle
        while (start != loopNode) {
            start = start.next;
            loopNode = loopNode.next;
        }

        ListNode prev = loopNode;
        while (prev.next != loopNode) {
            prev = prev.next;
        }
        prev.next = null; // Break the cycle
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create cycle: 5 → 3
        head.next.next.next.next.next = head.next.next;

        System.out.println("Cycle detected: " + detectCycle(head));
        System.out.print("List after removing cycle: ");
        printList(head);
    }
}
