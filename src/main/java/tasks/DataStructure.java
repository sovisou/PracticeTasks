package tasks;

public class DataStructure {
    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
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

    public static <T> void printLinkedListRecursively(Node<T> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value);
        if(head.next != null) {
            System.out.print(" -> ");
        }
        printLinkedListRecursively(head.next);
    }

    public static void main(String[] args) {
        Integer[] elements = {1, 2, 3, 4, 5};
        Node<Integer> head = createLinkedList(elements);
        System.out.println("Created Linked List: ");
        printLinkedList(head);
        System.out.println();
        System.out.println("Recursive Linked List: ");
        printLinkedListRecursively(head);
    }
}
