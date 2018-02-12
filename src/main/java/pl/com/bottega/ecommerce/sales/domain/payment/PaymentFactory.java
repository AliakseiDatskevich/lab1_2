package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PaymentFactory {

    public static Payment createPayment(Id id, ClientData clientData, Money multiplyBy) {
        Payment payment = new Payment(id, clientData, multiplyBy);
        return payment;
    }

}
