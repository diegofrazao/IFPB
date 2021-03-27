package br.edu.ifpb.padroes.domain;

import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;
import br.edu.ifpb.padroes.service.order.OrderState;
import br.edu.ifpb.padroes.service.order.OrderStateEnum;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.strategy.Payment;

import java.time.Instant;
import java.util.List;

public class Order {

    private Long id;
    private Customer customer;
    private Instant creationDate;
    private Restaurant restaurant;
    private List<OrderItem> orderItemList;
    private OrderState currentState;

    public Order() {
        this.currentState = OrderStateEnum.IN_PROGRESS;
    }

    public Order(OrderState currentState){
        this.currentState = currentState;
    }

    public void makePaymentOrder(PaymentService paymentService, Payment paymentStrategy){
        this.currentState = currentState.paymentOrder(paymentService, paymentStrategy);
    }

    public void sendEmailNotification(EmailNotification emailNotification){
        this.currentState.emailNotification(emailNotification);
    }

    public void log(LogService logService){
        this.currentState.logService(logService);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
