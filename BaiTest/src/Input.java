import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
    Scanner sc = new Scanner(System.in);
    String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.-_!@#&()–[{}]:;',?/*~$^+=<>]).{7,15}$";
    public String enterUsername() {
        System.out.println("Mời bạn nhập tên tài khoản:");
        return sc.nextLine();
    }

    public String enterPassword() {
        String password=null;
        boolean ischeck = false;
        do {
            System.out.println("Mời bạn nhập mật khẩu:");
            try {
                password = sc.nextLine();
                if (!Pattern.matches(PASSWORD_REGEX, password))
                    throw new Exception("Sai định dạng mật khẩu , vui lòng nhập lại");
                ischeck = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!ischeck);
        return password;
    }

    public String enterEmail() {
        String email =null;
        boolean ischeck = false;
        do {
            try {
                System.out.println("Mời bạn nhập email:");
                email = sc.nextLine();
                if (!Pattern.matches(EMAIL_REGEX, email))
                    throw new Exception("Sai định dạng email , vui lòng nhập lại!");
                ischeck = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!ischeck);
        return email;
    }
}
