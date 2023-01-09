import com.google.common.base.Objects;

import java.util.function.BiConsumer;

public class Generic {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        pair.ifPresent((first, second) -> {
            System.out.println(first);
            System.out.println(second);
        });
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
        System.out.println(Pair.empty());
    }
}
class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public F getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<F, S> p = (Pair<F, S>) o;
        return Objects.equal(p.first, first) && Objects.equal(p.second, second);
    }
    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
    }
    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair(first, second);
    }
    public void ifPresent(BiConsumer<? super F, ? super S> consumer) {
        if ((first != null) & (second != null))
            consumer.accept(first, second);
    }
    public static <F, S> Pair<F, S> empty(){
        return null;
    }
}
