package oops.Encapsulation;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class User {
    private String email;

    public void updateEmail(String newEmail) {
        if (newEmail != null && newEmail.contains("@")) {
            this.email = newEmail;
        } else {
            throw new IllegalArgumentException("Invalid email");
        }
    }

    public String getEmail() {
        return email;
    }
}

public class Encapsulate {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.withdraw(300);

        System.out.println(acc.getBalance());
    }
}