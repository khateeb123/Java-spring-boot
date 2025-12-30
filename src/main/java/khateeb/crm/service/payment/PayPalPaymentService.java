package khateeb.crm.service.payment;

import org.springframework.beans.factory.annotation.Value;

public class PayPalPaymentService implements PaymentService{

    @Value( value = "${paypal.api-key}")
    private String apiKey;
    public void processPayment(double amount){
        System.out.println("payment is processed by paypal this time =--------------");
        System.out.println(" api key = "+ apiKey);
    }
    
}
