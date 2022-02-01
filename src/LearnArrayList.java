import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        for (Integer elem : list) {
            System.out.println("forEach: " + elem);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator: " + it.next());
        }
    }
}
