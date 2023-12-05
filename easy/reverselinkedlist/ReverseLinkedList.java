package easy.reverselinkedlist;

public class ReverseLinkedList {
  public static void main(String[] args) {
//    Case 1: [1,2,3,4,5]
    ListNode case01 = new ListNode(1);
    case01.next = new ListNode(2);
    case01.next.next = new ListNode(3);
    case01.next.next.next = new ListNode(4);
    case01.next.next.next.next = new ListNode(5);

//    ListNode reverseCase01 = Solution.reverseListIteratively(case01);
    ListNode reverseCase01 = Solution.reverseListRecursively(case01);

    Solution.printList(reverseCase01);

//    Case 2: [1,2]
    ListNode case02 = new ListNode(1);
    case02.next = new ListNode(2);

//    ListNode reverseCase02 = Solution.reverseListIteratively(case02);
    ListNode reverseCase02 = Solution.reverseListRecursively(case02);

    Solution.printList(reverseCase02);

//    Case 3: []
    ListNode case03 = new ListNode();

//    ListNode reverseCase03 = Solution.reverseListIteratively(case03);
    ListNode reverseCase03 = Solution.reverseListRecursively(case03);

    Solution.printList(case03);
  }
}
