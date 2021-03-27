package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.strategy.Payment;

public interface OrderState {
    OrderState paymentOrder (PaymentService paymentService, Payment paymentStrategy);
    OrderState emailNotification(EmailNotification emailNotification);
    OrderState logService(LogService logService);
}
