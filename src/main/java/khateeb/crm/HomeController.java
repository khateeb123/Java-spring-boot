package khateeb.crm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final OrderService orderService;

    public HomeController(OrderService orderService){
        this.orderService = orderService;
    }

  
@RequestMapping("/")
    public String home() {

		orderService.processOrder(); 
        
        return "index.html";
    }

}
