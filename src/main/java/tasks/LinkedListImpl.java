package tasks;

public class LinkedListImpl<T> {


    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value ) {
            this.value = value;
            this.next = null;
        }
    }

    public static <T> Node<T> createLinkedList(T[] elements) {
        if (elements.length == 0) {
            return null;
        }
        Node<T> head = new Node<>(elements[0]);
        Node<T> current = head;
        for (int i = 1; i < elements.length; i++) {
            current.next = new Node<>(elements[i]);
            current = current.next;
        }

        return head;
    }

    public static <T> void printLinkedList(Node<T> head) {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }

    public static <T> Node<T> reverseLinkedList(Node<T> head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Integer[] elements = {1, 2, 3, 4, 5};
        Node<Integer> head = LinkedListImpl.createLinkedList(elements);
        System.out.println("Created Linked List: ");
        LinkedListImpl.printLinkedList(head);
        System.out.println();
        Node<Integer> newHead = reverseLinkedList(head);
        System.out.println("Reversed Linked List: ");
        LinkedListImpl.printLinkedList(newHead);
    }
}

