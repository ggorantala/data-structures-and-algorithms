package twopointers;

public class RemoveNthNode {
  public static void main(String[] args) {
    ListNode one = new ListNode(1);
    ListNode two = new ListNode(2);
    ListNode three = new ListNode(3);
    ListNode four = new ListNode(4);
    ListNode five = new ListNode(5);
    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;

    System.out.println(middleNode(one, 2));
  }

  public static ListNode middleNode(ListNode head, int n) {
    int length = 0;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = head;

    while (current != null) {
      length++;
      current = current.next;
    }

    length -= n;

    current = dummy;

    while (length-- > 0) {
      current = current.next;
    }

    current.next = current.next.next;
    return dummy.next;
  }

  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return "ListNode{" + "val=" + val + ", next=" + next + '}';
    }
  }
}
