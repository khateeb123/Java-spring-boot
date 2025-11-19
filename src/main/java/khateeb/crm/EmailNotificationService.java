package khateeb.crm;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message){
        System.out.println("email sent successfully");
        System.out.println("message" + message);
    }
    
}
