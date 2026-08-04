package lld.solid.factory;

public class Main {

    public static void main(String[] args) {

        String errorMessage = "Error";
        NotificationFactory factory = new NotificationFactory();

        SMSNotification smsNotification = (SMSNotification) factory.getNotification("SMS","not a valid phone number");
        smsNotification.notifyy();
    }
}
