package tasks;

public class LinkedListNew {
    public static <T> Node<T> createLinkedList(T[] elements) {
        Node<T> head = null;
        Node<T> tail = null;
        for (T element : elements) {
            Node<T> newNode = new Node<>(element);
            if(head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static <T> void printLinkedList(Node<T> head) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) {
                System.out.print(" -> ");
            }
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        Integer[] elements = {1, 2, 3, 4, 5};
        Node<Integer> head = createLinkedList(elements);
        System.out.println("Created Linked List: ");
        printLinkedList(head);
        System.out.println();

    }






    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }


}
