package khateeb.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import khateeb.crm.service.notification.NotificationManager;


@Controller
public class NotificationController {

    private final NotificationManager notificationManager;
    
    NotificationController(NotificationManager notificationManager){
        this.notificationManager = notificationManager;
    }
    
    @RequestMapping("/notification")
    public String index(){
    notificationManager.manageNotification("hello every one ");

        return "notification.html";
    }
}
