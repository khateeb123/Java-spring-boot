package khateeb.crm;

import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
    public void sendNotification(String message);
}
