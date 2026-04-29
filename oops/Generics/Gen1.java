
class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

}

public class Gen1 {

    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>();
        b1.set(19);
        System.out.println(b1.get());

    }
}
