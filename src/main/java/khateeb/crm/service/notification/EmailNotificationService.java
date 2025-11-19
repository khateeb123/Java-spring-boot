package khateeb.crm.service.notification;


public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message){
        System.out.println("email sent successfully");
        System.out.println("message" + message);
    }
    
}
