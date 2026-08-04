package lld.solid.factory;

public class NotificationFactory {

    private String type;
    private String message;



    public Notification getNotification(String type,String message)
    {
        if(type == null || type.isBlank())
            return null;

        return( switch(type.toUpperCase()) //Violates SRP and OCP
        {
            case "EMAIL" -> new EmailNotification(message);

            case "SMS"  -> new SMSNotification(message);

            default ->  throw new IllegalArgumentException("Not a valid type");
        });
    }
}
