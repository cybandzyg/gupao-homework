package gupao.navbar;

import java.util.ArrayList;
import java.util.List;

/**
 * 基础未登录导航栏
 * @Author: CYB
 * @Date: 2020/3/5 10:42
 */
public class BaseNavbar extends Navbar {
    @Override
    protected List<String> getNavbarName() {
        List<String> list = new ArrayList<>();
        list.add("问答");
        list.add("文章");
        list.add("精选课");
        list.add("冒泡");
        list.add("商城");
        return list;
    }
}
