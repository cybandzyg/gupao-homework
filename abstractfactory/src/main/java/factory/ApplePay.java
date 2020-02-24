package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 13:33
 */
public class ApplePay extends ExternalPay{
    @Override
    public void pay() {
        super.init();
        System.out.println("apple pay支付中");
    }
}
