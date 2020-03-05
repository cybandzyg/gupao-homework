package gupao.navbar;

import java.util.List;

/**
 * @Author: CYB
 * @Date: 2020/3/5 10:46
 */
public class NavbarDecorator extends Navbar{

    private Navbar navbar;

    public NavbarDecorator(Navbar navbar) {
        this.navbar = navbar;
    }

    @Override
    protected List<String> getNavbarName() {
        return this.navbar.getNavbarName();
    }
}
