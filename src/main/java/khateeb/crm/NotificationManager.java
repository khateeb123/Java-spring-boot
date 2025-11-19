package khateeb.crm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    public NotificationService notificationService;


    public NotificationManager(@Qualifier("email") NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void manageNotification(String message){
        
        notificationService.sendNotification(message);
    }
}
