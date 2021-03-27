package br.edu.ifpb.padroes.strategy;

public class PaypalPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Do paypal payment!");
    }
}
