package khateeb.crm;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService {

    @Override
        public void sendNotification(String message){
        System.out.println("email sent successfully");
        System.out.println("message" + message);
    }
    
}
