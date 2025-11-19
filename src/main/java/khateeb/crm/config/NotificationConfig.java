package khateeb.crm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import khateeb.crm.service.notification.EmailNotificationService;
import khateeb.crm.service.notification.NotificationManager;
import khateeb.crm.service.notification.NotificationService;
import khateeb.crm.service.notification.SMSNotificationService;

@Configuration
public class NotificationConfig {

    @Bean
    public NotificationService email(){
        return new EmailNotificationService();
    }

    @Bean
    public NotificationService sms(){
        return new SMSNotificationService();    
    }

    @Bean 
    public NotificationManager notificationManager(){
        return new NotificationManager(email());
    } 

    
}
