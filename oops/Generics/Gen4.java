
import java.util.*;

public class Gen4 {

//UnBounded wildcard 
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    /* UpperBounded wilcards 
  can read elements as type T.
  cannot add elements (except null), because the exact subtype is unknown.
     */
    public static void sumList(List<? extends Number> ls) {
        double sum = 0;
        for (Number n : ls) {
            sum += n.doubleValue();
        }

        System.out.println(sum);
    }

    public static void addNumbers(List<? super Integer> ls) {
        System.out.println("LowerBound has added something ");
        ls.add(19);
        ls.add(20);
    }

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Double> doubles = new ArrayList<>(List.of(1.1, 2.1, 3.1, 4.1));

        printList(ints);
        printList(doubles);
        sumList(ints);
        sumList(doubles);
        addNumbers(ints);

        printList(ints);

    }
}
