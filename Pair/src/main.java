import javax.swing.text.html.Option;
import java.util.Optional;

public class main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); //true!

        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
        System.out.println(pair.toString());
    }
}
