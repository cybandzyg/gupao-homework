package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 13:28
 */
public class DomesticPaymentFactory implements PaymentFactory{

    public DomesticPay createPayment(Class clazz) throws IllegalAccessException, InstantiationException {
        return (DomesticPay) clazz.newInstance();
    }
}
