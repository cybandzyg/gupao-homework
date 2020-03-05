package gupao.navbar;

import java.util.List;

/**
 * 讲师导航栏
 * @Author: CYB
 * @Date: 2020/3/5 11:04
 */
public class LecturerNavbarDecorator extends NavbarDecorator{
    public LecturerNavbarDecorator(BaseNavbar baseNavbar) {
        super(baseNavbar);
    }

    @Override
    protected List<String> getNavbarName() {
        List<String> navbarName = super.getNavbarName();
        navbarName.add("讲师");
        return navbarName;
    }
}
