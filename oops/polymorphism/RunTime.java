
public class RunTime {

    static abstract class NotifcationLogger {

        abstract void send(String message);

        void log() {
            System.out.println("Logged: " + getClass().getSimpleName());
        }
    }

    public static class EmailNotifier extends NotifcationLogger {

        void send(String message) {
            System.out.println("Email is sent : " + message);
        }
    }

    public class SMSNotifier extends NotifcationLogger {

        void send(String message) {
            System.out.println("Sms is sent : " + message);
        }
    }

    public class PushNotifier extends NotifcationLogger {

        void send(String message) {
            System.out.println("Push Notifcation is sent : " + message);
        }
    }

    public static void main(String[] args) {
        NotifcationLogger en = new EmailNotifier();
        en.send("Hello guys");
        en.log();
    }
}
