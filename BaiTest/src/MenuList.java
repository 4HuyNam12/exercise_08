import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuList {
    Scanner sc = new Scanner(System.in);
    UserService service = new UserService();

    public void menu() {
        String pattern = "^[1-2]";
        String menu = """
                Mời bạn lựa chọn
                1-Đăng nhập
                2-Đăng ký
                """;
        boolean ischeck1 = false;
        String choice = null;
        do {
            System.out.println(menu);
            try {
                choice = sc.nextLine();
                if (!Pattern.matches(pattern, choice)) throw new Exception("Lựa chọn không đúng , vui lòng chọn lại!");
                ischeck1 = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!ischeck1);
        switch (choice) {
            case "1"-> {boolean check =service.login();
                if (check) {
                    subMenu();
                } else {
                    System.out.println("lựa chọn");
                    System.out.println("1-Đăng nhập lại");
                    service.login();
                    System.out.println("2-Quên mật khẩu");
                    service.forgotPassword();
                }
            }
            case"2"->service.createNewAccount();
        }
        }

    public void subMenu (String userName) {
    String pattern = "^[0-4]";
            String menu = """
                Mời bạn lựa chọn:
                1-Thay đổi user name
                2-Thay đổi email
                3-Thay đổi mật khẩu
                4-Đăng xuất
                0-Thoát chương trình""";
            boolean ischeck = false;
            String choice = null;
            do {
                System.out.println(menu);
                try {
                    choice = sc.nextLine();
                    if (!Pattern.matches(pattern, choice)) throw new Exception("Lựa chọn không đúng , vui lòng chọn lại!") ;
                    ischeck = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }while(!ischeck);
            switch (choice) {
                case "1"->
                        service.changeUser(userName);
                case "2"->
                        service.changeEmail(userName);
                case "3 "->
                        service.changePassword(userName);
                case "4 " ->
                        menu();
                case"0" ->
                        System.exit(1);
            }
        }
    }

