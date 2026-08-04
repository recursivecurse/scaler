package lld.solid.factory;

public class SMSNotification implements Notification{

    private String message;

    SMSNotification(String message)
    {
        this.message = message;
    }

    @Override
    public void notifyy() {
        System.out.println("Sending SMS message "+ message);
    }
}
