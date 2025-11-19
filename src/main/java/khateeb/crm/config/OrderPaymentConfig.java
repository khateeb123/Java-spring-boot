package khateeb.crm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import khateeb.crm.service.order.OrderService;
import khateeb.crm.service.payment.PayPalPaymentService;
import khateeb.crm.service.payment.PaymentService;
import khateeb.crm.service.payment.StripePaymentService;

@Configuration
public class OrderPaymentConfig {

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }
    
    @Bean
    public OrderService order(){
        return new OrderService(paypal());
    }
}
