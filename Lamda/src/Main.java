public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        Menu menu = new Menu();
        boolean ischeck = login.login();
        while (!ischeck) {
            System.out.println("Sai số điện thoại hoặc mật khẩu , mời nhập lại");
            ischeck = login.login();
        }
        menu.menuList();
    }
}
