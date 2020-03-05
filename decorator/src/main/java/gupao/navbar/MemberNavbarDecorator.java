package gupao.navbar;

import java.util.List;

/**
 * 会员导航栏
 * @Author: CYB
 * @Date: 2020/3/5 11:00
 */
public class MemberNavbarDecorator extends NavbarDecorator{
    public MemberNavbarDecorator(Navbar navbar) {
        super(navbar);
    }

    @Override
    protected List<String> getNavbarName() {
        List<String> nabName = super.getNavbarName();
        nabName.add("作业");
        nabName.add("题库");
        nabName.add("成长墙");
        return nabName;
    }
}
