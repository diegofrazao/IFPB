package br.edu.ifpb.padroes.strategy;

public class DebitPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Do debit payment!");
    }
}
