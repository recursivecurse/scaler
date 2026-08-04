package lld.solid.adapter;

public class Main {
    public static void main(String[] args) {

        WhatsappNotification whatsappNotification = new WhatsappNotification();
        NotificationSender notification = new WhatsAppNotificationAdapter(whatsappNotification);
        notification.notify("Hi Good Morning");
    }
}
