package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 13:39
 */
public class ExternalPaymentFactory implements PaymentFactory{

    public ExternalPay createPayment(Class<? extends IPay> clazz) throws IllegalAccessException, InstantiationException {
        return (ExternalPay) clazz.newInstance();
    }
}
