import java.util.HashSet;

public class SymmetricDifference<T> {

    public HashSet<T> symmetricDifference(HashSet<? extends T> set1, HashSet<? extends T> set2) {
        HashSet<T> result = new HashSet<>();

        for (T i: set1) {
            if (!set2.contains(i)) {
                result.add(i);
            }
        }

        for (T j: set2) {
            if (!set1.contains(j)) {
                result.add(j);
            }
        }

        return result;
    }
}
