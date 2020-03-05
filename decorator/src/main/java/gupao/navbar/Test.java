package gupao.navbar;

/**
 * @Author: CYB
 * @Date: 2020/3/5 11:06
 */
public class Test {

    public static void main(String[] args) {
        BaseNavbar baseNavbar;
        baseNavbar = new BaseNavbar();
        System.out.println("未登录状态导航栏："+baseNavbar.getNavbarName().toString());
        baseNavbar = new MemberNavbarDecorator(baseNavbar);
        System.out.println("会员登录状态导航栏："+baseNavbar.getNavbarName().toString());
        baseNavbar = new LecturerNavbarDecorator(baseNavbar);
        System.out.println("讲师登录状态导航栏："+baseNavbar.getNavbarName().toString());
    }
}
