package br.edu.ifpb.padroes.strategy;

public class CreditCardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Do creditcard payment!");
    }
}
