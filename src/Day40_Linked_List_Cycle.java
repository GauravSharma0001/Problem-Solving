//141. Linked List Cycle
//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.

public class Day40_Linked_List_Cycle {
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

        // Creating cycle: node5 points back to node3
        node5.next = node3;

        System.out.println("Has Cycle: " +hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow= head, fast=head;
        while(fast !=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast !=null && fast.equals(slow)){
                return true;
            }
        }
        return false;
    }
}

 class ListNode { 
    int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }