package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 13:41
 */
public interface PaymentFactory {
     IPay createPayment(Class<? extends IPay> clazz) throws IllegalAccessException, InstantiationException;
}
