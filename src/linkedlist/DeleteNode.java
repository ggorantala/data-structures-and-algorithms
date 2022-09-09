package linkedlist;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(a);

        deleteNode(b);

        System.out.println(a);

    }

    private static void deleteNode(ListNode nodeToDelete) {
        ListNode nextNode = nodeToDelete.next;

        if (nextNode != null) {
            nodeToDelete.value = nextNode.value;
            nodeToDelete.next = nextNode.next;
        } else {
            throw new IllegalArgumentException("Can't delete the last node with this technique!");
        }
    }
}

class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListNode{" + "value=" + value + ", next=" + next + '}';
    }
}
