package khateeb.crm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

public class PayPalPaymentService implements PaymentService{

    @Value("${paypal.api-key}")
    private String apiKey;
    public void processPayment(double amount){
        System.out.println("payment is processed by paypal this time =--------------");
        System.out.println(" api key = "+ apiKey);
    }
    
}
