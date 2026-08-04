package lld.solid.adapter;

import lld.solid.factory.Notification;

public class WhatsAppNotificationAdapter implements NotificationSender {

    private WhatsappNotification notification;

    WhatsAppNotificationAdapter(WhatsappNotification notification)
    {
        this.notification = notification;
    }

    @Override
    public void notify(String msg) {
        notification.sendWhatsApp(msg);
    }
}
