public class homeworktask1 {
    class LinkedListNode {
        int data;
        LinkedListNode next;

        LinkedListNode(int data) {
            this.data = data;
        }
    }

    class LinkedList {
        LinkedListNode head;

        LinkedListNode reverse(LinkedListNode node) {
            LinkedListNode prev = null;
            LinkedListNode current = node;
            LinkedListNode next = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
        }

        void printList(LinkedListNode node) {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.head = new LinkedListNode(1);
            list.head.next = new LinkedListNode(2);
            list.head.next.next = new LinkedListNode(3);
            list.head.next.next.next = new LinkedListNode(4);

            System.out.println("Original list:");
            list.printList(list.head);

            list.head = list.reverse(list.head);
            System.out.println("\nReversed list:");
            list.printList(list.head);
        }
    }
}
