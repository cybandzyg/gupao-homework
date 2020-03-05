package gupao.navbar;

import java.util.List;

/**
 * @Author: CYB
 * @Date: 2020/3/5 10:46
 */
public class NavbarDecorator extends BaseNavbar{

    private BaseNavbar baseNavbar;

    public NavbarDecorator(BaseNavbar baseNavbar) {
        this.baseNavbar = baseNavbar;
    }

    @Override
    protected List<String> getNavbarName() {
        return this.baseNavbar.getNavbarName();
    }
}
