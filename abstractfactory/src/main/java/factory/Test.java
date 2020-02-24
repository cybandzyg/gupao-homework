package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 15:42
 */
public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        PaymentFactory paymentFactory = new DomesticPaymentFactory();
        IPay payment = paymentFactory.createPayment(AliPay.class);
        payment.pay();
        PaymentFactory paymentFactoryE =new ExternalPaymentFactory();
        IPay payment1 = paymentFactoryE.createPayment(ApplePay.class);
        payment1.pay();
    }
}
