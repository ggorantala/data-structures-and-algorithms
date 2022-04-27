package twopointers;

public class MiddleOfLinkedList {
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

    System.out.println(middleNode(one));
  }

  public static ListNode middleNode(ListNode head) {
    ListNode first = head;
    ListNode second = head;

    while (second.next != null && second.next.next != null) {
      first = first.next;
      second = second.next.next;
    }

    if (second.next != null) {
      first = first.next;
    }

    return first;
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
