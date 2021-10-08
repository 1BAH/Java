import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        set1.add(34);
        set1.add(9);
        set1.add(2);

        SymmetricDifference<Integer> s = new SymmetricDifference<>();

        System.out.print(s.symmetricDifference(myHashSet, set1).toString());
    }
}
