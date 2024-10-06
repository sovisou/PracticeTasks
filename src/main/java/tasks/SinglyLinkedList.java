package tasks;

public class SinglyLinkedList {
    public static void deleteNode(ListNode node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }
    class ListNode {
        int value;
        ListNode next;

        ListNode(int x) {
            value = x;
        }
    }

}
