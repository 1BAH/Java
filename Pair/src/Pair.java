import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * A container of a pair of objects which may or may not contain non-{@code null} values.
 * Class {@code Pair} is an analogue of class {@code Optional}.
 * @author 1BAH
 * @param <T1> the type of the first value
 * @param <T2> the type of the second value
 */
public final class Pair<T1, T2> {
    /**
     * Common instance for {@code empty()}.
     */
    private static final Pair<?, ?> EMPTY = new Pair<>(null, null);

    /**
     * If non-null, the values; if null, indicates no value is present
     */
    private final T1 firstValue;
    private final T2 secondValue;

    /**
     * Returns an empty {@code Pair} instance.
     * No values are present for this {@code Pair}.
     * @param <T1> the type of non-existent value number one
     * @param <T2> the type of non-existent value number two
     * @return an empty {@code Pair}
     */
    public static <T1, T2> Pair<T1, T2> empty() {
        Pair<T1, T2> t = (Pair <T1, T2>) EMPTY;
        return t;
    }

    /**
     * Constructs an instance with the described values.
     * @param firstValue the first value
     * @param secondValue the second value
     */
    private Pair (T1 firstValue, T2 secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    /**
     * Returns a {@code Pair} describing the given values. The values can be {@code null}.
     * @param value1 the first value to describe, which can be {@code null}
     * @param value2 the second value to describe, which can be {@code null}
     * @param <T1> the type of the first value
     * @param <T2> the type of the first value
     * @return a {@code Pair} with the defined values
     */
    public static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
        if (value1 == null && value2 == null) {
            return (Pair<T1, T2>) EMPTY;
        }
        if (value1 == null) {
            return (Pair<T1, T2>)  new Pair<>(null, value2);
        }
        if (value2 == null) {
            return (Pair<T1, T2>)  new Pair<>(value1, null);
        }
        return  new Pair<>(value1, value2);
    }

    /**
     * If the first value is present, returns it, otherwise throws {@code NoSuchElementException}.
     * @return the non-{@code null} first value described by this {@code Pair}
     * @throws NoSuchElementException if the first value is {@code null}
     */
    public T1 getFirst() {
        if (firstValue == null) {
            throw new NoSuchElementException("First value is not defined");
        }
        return firstValue;
    }

    /**
     * If the second value is present, returns it, otherwise throws {@code NoSuchElementException}.
     * @return the non-{@code null} second value described by this {@code Pair}
     * @throws NoSuchElementException if the second value is {@code null}
     */
    public T2 getSecond() {
        if (secondValue == null) {
            throw new NoSuchElementException("Second value is not defined");
        }
        return secondValue;
    }

    /**
     * Indicates whether some other object is "equal to" this {@code Pair}.
     * The other object is considered equal if:
     * <ul>
     * <li>it is also an {@code Pair} and;
     * <li>both pairs of instances have no value present or;
     * <li>the pairs of present values are "equal to" each other via {@code equals()}.
     * </ul>
     *
     * @param obj an object to be tested for equality
     * @return {@code true} if the other object is "equal to" this object
     *         otherwise {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair<?, ?> other = (Pair<?, ?>) obj;
        return (Objects.equals(other.getFirst(), this.getFirst()) && Objects.equals(other.getSecond(), this.getSecond()));
    }

    /**
     * Returns the hash code of the Pair, if both values are present, otherwise {@code 0} (zero) if no value is present.
     *
     * @return stacked two hash codes of the present values or {@code 0} if no value is
     *         present
     */
    @Override
    public int hashCode () {
        return Integer.parseInt(Integer.toString(Objects.hashCode(firstValue)) + Integer.toString(Objects.hashCode(secondValue)));
    }

    /**
     * Returns a non-empty string representation of this {@code Pair}, otherwise returns "empty".
     *
     * @return the string representation of this instance
     */
    @Override
    public String toString() {
        if (firstValue == null && secondValue == null) {
            return "Pair.empty";
        }
        if (firstValue == null) {
            return String.format("Pair {%s, %s}", "empty", secondValue);
        }
        if (secondValue == null) {
            return String.format("Pair {%s, %s}", firstValue, "empty");
        }
        return String.format("Pair[%s, %s]", firstValue, secondValue);
    }
}
