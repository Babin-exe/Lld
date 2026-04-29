
class NumberOnly<T extends Number> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }
}

class MinMax<T extends Comparable<T>> {

    public T min(T a, T b) {

        return a.compareTo(b) < 0 ? a : b;
    }

}

public class Gen3 {

    public static void main(String[] args) {

        NumberOnly<Integer> it = new NumberOnly<>();
        it.set(19);
        System.out.println(it.get());

        NumberOnly<Double> n = new NumberOnly<>();
        n.set(184.243);
        System.out.print(n.get());

        MinMax<Integer> imin = new MinMax<>();
        System.out.println(imin.min(10, 20));

        MinMax<String> smin = new MinMax<>();
        System.out.println(smin.min("rust", "bob"));
    }
}
