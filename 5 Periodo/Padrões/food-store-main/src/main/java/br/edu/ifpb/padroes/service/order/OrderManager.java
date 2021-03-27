package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.log.LogHandler;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;
import br.edu.ifpb.padroes.strategy.Payment;

public class OrderManager {

    public OrderManager(Order order) {
        this.order = order;
    }

    private Order order;
    private EmailNotification emailNotification = new EmailNotification();
    private PaymentService paymentService = new PaymentService();
    private LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));

    public void payOrder(Payment paymentStrategy) {
        order = new Order(OrderStateEnum.IN_PROGRESS);
        order.makePaymentOrder(paymentService, paymentStrategy);
        order.sendEmailNotification(emailNotification);
        order.log(logService);
    }

    public void cancelOrder() {
        order = new Order(OrderStateEnum.CANCELED);
        order.sendEmailNotification(emailNotification);
        order.log(logService);
    }
}
