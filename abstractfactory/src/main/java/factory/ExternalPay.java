package factory;

/**
 * @Author: CYB
 * @Date: 2020/2/24 15:30
 */
public abstract class ExternalPay implements IPay{
    public void init(){
        System.out.println("国际支付初始化");
    }

    abstract public void pay();
}
