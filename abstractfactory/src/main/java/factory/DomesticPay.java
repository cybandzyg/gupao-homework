package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 15:30
 */
public abstract class DomesticPay implements IPay{

    public void init(){
        System.out.println("国内支付初始化");
    }

    abstract public void pay();
}
