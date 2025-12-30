package khateeb.crm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import khateeb.crm.service.order.OrderService;

@Controller
public class HomeController {

    private final OrderService orderService;

    private Map<String , Object> data = new HashMap<>();

    public HomeController(OrderService orderService){
        this.orderService = orderService;
    }

  
    @RequestMapping("/")
    public String home() {

        data.put("name","khateeb");
        data.put("age",30);
        data.put("premiumUser",true);
        data.put("father","shah");
        data.put("some","ahm");
        data.put("power","youdfdfng");

for (Map.Entry<String, Object> sing : data.entrySet()) {
    System.out.println(sing.getKey());
}       
     
for (Map.Entry<String, Object> iterable_element : data.entrySet()) {
    
    System.out.println(iterable_element);
}
        //  String type = "stripe";
		// orderService.processOrder(type); 
        
        return "index.html";
    }

}
