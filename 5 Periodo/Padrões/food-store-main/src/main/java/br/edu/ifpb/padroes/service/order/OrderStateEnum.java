package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.strategy.Payment;

public enum OrderStateEnum implements OrderState{

    IN_PROGRESS {
        @Override
        public OrderState paymentOrder(PaymentService paymentService, Payment paymentStrategy) {
            try{
                paymentService.doPayment(paymentStrategy);
                return PAYMENT_SUCCESS;
            }catch (Exception e){
                return PAYMENT_REFUSED;
            }
        }

        @Override
        public OrderState emailNotification(EmailNotification emailNotification) {
            return null;
        }

        @Override
        public OrderState logService(LogService logService) {
            return null;
        }
    },

    CANCELED {
        @Override
        public OrderState paymentOrder(PaymentService paymentService, Payment paymentStrategy) {
            return null;
        }

        @Override
        public OrderState emailNotification(EmailNotification emailNotification) {
            return null;
        }

        @Override
        public OrderState logService(LogService logService) {
            return null;
        }
    },

    PAYMENT_SUCCESS {
        @Override
        public OrderState paymentOrder(PaymentService paymentService, Payment paymentStrategy) {
            return null;
        }

        @Override
        public OrderState emailNotification(EmailNotification emailNotification) {
            return null;
        }

        @Override
        public OrderState logService(LogService logService) {
            return null;
        }
    },

    PAYMENT_REFUSED {
        @Override
        public OrderState paymentOrder(PaymentService paymentService, Payment paymentStrategy) {
            return null;
        }

        @Override
        public OrderState emailNotification(EmailNotification emailNotification) {
            return null;
        }

        @Override
        public OrderState logService(LogService logService) {
            return null;
        }
    }
}
