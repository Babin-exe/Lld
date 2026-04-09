
public class SubType {

    public static interface Discountable {

        double applyDiscount(double price);

        String label();
    }

    public static class SeasonalDiscount implements Discountable {

        public double applyDiscount(double price) {
            return price * 0.80;
        }

        public String label() {
            return "20% Discount applied ";
        }
    }

    public static class MemberDiscount implements Discountable {

        public double applyDiscount(double price) {
            return price * 0.90;
        }

        public String label() {
            return "10% Discount given";
        }
    }

    public static class CouponDiscount implements Discountable {

        public double applyDiscount(double price) {
            return Math.max(0, price - price * 0.50);
        }

        public String label() {
            return "Flat 50% discount";
        }
    }

    public static void main(String[] args) {
        Discountable cd = new CouponDiscount();
        System.out.println(cd.applyDiscount(800));
        System.out.println(cd.label());
    }

}
