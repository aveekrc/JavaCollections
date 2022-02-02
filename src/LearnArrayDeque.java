import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(12);
        queue.offerFirst(20);
        queue.offerLast(2);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
    }
}
