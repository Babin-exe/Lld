
class Pair<K, V> {

    private K key;
    private V value;

    // public Pair(K key, V value) {
    //     this.key = key;
    //     this.value = value;
    // }
    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

}

class Triple<A, B, C> {

    private A first;
    private B second;
    private C third;

    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return this.first;
    }

    public B getSecond() {
        return this.second;
    }

    public C getThird() {
        return this.third;
    }

}

public class Gen2 {

    public static void main(String[] args) {

        Pair<String, Integer> pr = new Pair<>();
        pr.set("Rustin", 19);

        System.out.println(pr.getKey());
        System.out.println(pr.getValue());

        Triple<String, Integer, Boolean> t = new Triple<>("age", 21, true);
        System.out.println(t.getFirst());
        System.out.println(t.getSecond());
        System.out.println(t.getThird());

    }
}
