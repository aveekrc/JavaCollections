import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(10);
        pq.offer(5);
        pq.offer(28);
        pq.offer(2);

        System.out.println(pq);
    }
}
