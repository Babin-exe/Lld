
import java.util.*;

public class Parametric {

    public static class Repository<T> {

        private final List<T> store = new ArrayList<>();

        public void save(T data) {
            store.add(data);
        }

        public T findById(int id) {
            return store.get(id);
        }

        public List<T> findAll() {
            return Collections.unmodifiableList(store);
        }

    }

    public static class User {
    }

    public static class Product {
    }

    public static class Order {
    }

    public static void main(String[] args) {

        Repository<User> userRepo = new Repository<>();
        Repository<Product> productRepo = new Repository<>();
        Repository<Order> orderRepo = new Repository<>();

        userRepo.save(new User());

        System.out.println(userRepo.findAll());
    }
}
