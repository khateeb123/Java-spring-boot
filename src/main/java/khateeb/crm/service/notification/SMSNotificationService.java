package khateeb.crm.service.notification;


public class SMSNotificationService implements NotificationService {

    @Override
        public void sendNotification(String message){
        System.out.println("email sent successfully");
        System.out.println("message" + message);
    }
    
}
