package oops.Abstraction;

public class Abstraction {

    interface NotificationSender {
        void send(String to, String message);
    }

    static class EmailSender implements NotificationSender {
        public void send(String to, String message) {
            System.out.println("Sending EMAIL to " + to + ": " + message);
        }
    }

    static class SmsSender implements NotificationSender {
        public void send(String to, String message) {
            System.out.println("Sending SMS to " + to + ": " + message);
        }
    }

    static class PushNotificationSender implements NotificationSender {
        public void send(String to, String message) {
            System.out.println("Sending PUSH notification to " + to + ": " + message);
        }
    }

    static class NotificationService {
        private NotificationSender sender;

        public NotificationService(NotificationSender sender) {
            this.sender = sender;
        }

        public void notifyUser(String user, String message) {
            sender.send(user, message);
        }
    }

    public static void main(String[] args) {
        NotificationSender sender = new EmailSender();
        NotificationService service = new NotificationService(sender);

        service.notifyUser("user@example.com", "Welcome!");
    }

}
