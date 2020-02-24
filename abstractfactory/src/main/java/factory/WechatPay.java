package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 13:33
 */
public class WechatPay extends DomesticPay{
    @Override
    public void pay() {
        super.init();
        System.out.println("微信支付中");
    }
}
