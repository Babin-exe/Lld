
public class CompileTime {

    public static class PaymentService {

        public double processPayment(String cardNumber, double amount) {
            return amount * 1.02;
        }

        public double processPayment(String upiNumber, double amount, String currency) {
            return amount;
        }

        public double processPayment(int walletId, double amount) {
            return amount * 1.002;
        }
    }

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        System.out.println(ps.processPayment("Upi101", 1005, "Npr"));
        System.out.println(ps.processPayment(101, 1005));

    }
}
