package khateeb.crm.service.order;
import java.util.Map;
import khateeb.crm.service.payment.PaymentService;

public class OrderService {

    private final Map<String, PaymentService> paymentService;


    public OrderService( Map<String, PaymentService>  paymentService){
        this.paymentService = paymentService;
    }

    public void processOrder(String type){

        PaymentService service = paymentService.get(type); 

        service.processPayment(10);
    }
}
