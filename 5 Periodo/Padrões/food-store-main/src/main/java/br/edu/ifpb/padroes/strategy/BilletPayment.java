package br.edu.ifpb.padroes.strategy;

public class BilletPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Do billet payment!");
    }
}
