//19. Remove Nth Node From End of List
//Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class Day41_Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode result = removeNthFromEnd(head, 2);
        printList(result);

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null)
            return head.next;

        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        if(slow != null && slow.next!=null)
            slow.next = slow.next.next;

        return head;
    }
    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
