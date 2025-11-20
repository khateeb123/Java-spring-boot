package khateeb.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import khateeb.crm.service.order.OrderService;

@Controller
public class HomeController {

    private final OrderService orderService;

    public HomeController(OrderService orderService){
        this.orderService = orderService;
    }

  
@RequestMapping("/")
    public String home() {

         String type = "stripe";
		orderService.processOrder(type); 
        
        return "index.html";
    }

}
