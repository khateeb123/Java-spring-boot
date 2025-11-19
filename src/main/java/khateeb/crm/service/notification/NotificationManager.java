package khateeb.crm.service.notification;

import org.springframework.beans.factory.annotation.Qualifier;

public class NotificationManager {

    public NotificationService notificationService;


    public NotificationManager(@Qualifier("email") NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void manageNotification(String message){
        
        notificationService.sendNotification(message);
    }
}
