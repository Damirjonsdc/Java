import java.util.LinkedList;
public class homeworktask2 {
    public class Queue<T> {
        private LinkedList<T> list;

        public Queue() {
            list = new LinkedList<>();
        }

        public void enqueue(T element) {
            list.addLast(element);
        }

        public T dequeue() {
            return list.removeFirst();
        }

        public T first() {
            return list.getFirst();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int size() {
            return list.size();
        }
    }
        public static void main(String[] args) {
            Queue<Integer> queue = new Queue<>();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);

            System.out.println(queue.first()); // Output: 1

            int removedElement = queue.dequeue();
            System.out.println(removedElement); // Output: 1

            System.out.println(queue.size()); // Output: 2
            System.out.println(queue.isEmpty()); // Output: false

        }
    }
}