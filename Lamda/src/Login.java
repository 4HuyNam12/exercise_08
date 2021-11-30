import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);

    public boolean login() {
        String mobile = "1";
        String password = "2";
        System.out.println("Nhập số điện thoại");
        String mobileNumber = sc.nextLine();
        System.out.println("Nhập mật khẩu");
        String pw = sc.nextLine();
        if (mobileNumber.equals(mobile) && pw.equals(password)) {
            System.out.println("Đăng nhập thành công");
            return true;
        }
        return false;
    }

}
