package khateeb.crm;

import org.springframework.beans.factory.annotation.Value;

public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiKey}")
    private String apiKey;
    
    public void processPayment(double amount){
        System.out.println("order placed-------------------------------");
        System.out.println("stripe key- = " + apiKey);
    }
    
}
