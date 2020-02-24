package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 13:32
 */
public class AliPay extends DomesticPay{

    @Override
    public void pay() {
        super.init();
        System.out.println("支付宝支付中");
    }
}
