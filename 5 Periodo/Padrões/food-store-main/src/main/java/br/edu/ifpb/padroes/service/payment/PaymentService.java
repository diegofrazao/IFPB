package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.strategy.Payment;

public class PaymentService {

    public void doPayment(Payment paymentStrategy) throws Exception{
        try{
            paymentStrategy.doPayment();
        }catch (Exception e){
            throw new Exception("Error on payment");
        }
    }
}
