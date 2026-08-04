package lld.solid.factory;

public class EmailNotification implements Notification{

    private String message;

    EmailNotification(String message)
    {
        this.message = message;
    }

    @Override
    public void notifyy() {

        System.out.println("Sending email message " + message);
    }
}
