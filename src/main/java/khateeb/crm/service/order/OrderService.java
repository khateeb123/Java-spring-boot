package khateeb.crm.service.order;

import khateeb.crm.service.payment.PaymentService;

public class OrderService {

    private PaymentService paymentService;


    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void processOrder(){
        paymentService.processPayment(10);
    }
}