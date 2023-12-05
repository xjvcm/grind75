package easy.reverselinkedlist;

public class Solution {
  /* Iteration: Iterative Method */
  public static ListNode reverseListIteratively(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode current = head;
    ListNode reverse = new ListNode(current.val);

    while (current.next != null) {
      reverse = new ListNode(current.next.val, reverse);
      current = current.next;
    }

    return reverse;
  }

  /* Recursion: Recursive Method */
  public static ListNode reverseListRecursively(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode reverse = reverseListRecursively(head.next);
    head.next.next = head;
    head.next = null;
    return reverse;
  }

  public static void printList(ListNode head) {
    while (head != null) {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("null");
  }
}
