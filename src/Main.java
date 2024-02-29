import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        q.add("Maymun");
        q.add("Furkan");
        q.add("Emir");
        q.add("G");

        //Queue methodları burada da geçerlidir

        for (String s : q){
            System.out.println(s);
        }
    }
}