import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuList {
    UserService service = new UserService();
    Scanner sc = new Scanner(System.in);

    public void menu(ArrayList<User> listAll) {
        String userName;
        String menu = """
                Mời bạn lựa chọn
                1-Đăng nhập
                2-Đăng ký
                3-Thoát""";
        int choice = 0;
        do {
            System.out.println(menu);
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Lựa chọn sai vui lòng chọn lại");
            }
            switch (choice) {
                case 1 -> {
                    userName = service.login(listAll);
                    subMenu(userName, listAll);
                }
                case 2 -> service.createNewAccount(listAll);
                case 3 -> System.exit(1);
            }
        } while (choice != 0);
    }

    public void subMenu(String userName, ArrayList<User> listAll) {
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
            do {
                System.out.println(menu);
                try {
                    choice = sc.nextLine();
                    if (!Pattern.matches(pattern, choice))
                        throw new Exception("Lựa chọn không đúng , vui lòng chọn lại!");
                    ischeck = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (!ischeck);
            switch (choice) {
                case "1" -> {
                    service.changeUser(userName, listAll);
                    System.out.println("Thay đổi user thành công");
                }
                case "2" -> {
                    service.changeEmail(userName, listAll);
                    System.out.println("Thay đổi email thành công");
                }
                case "3" -> {
                    service.changePassword(userName, listAll);
                    System.out.println("Thay đổi password thành công");
                }
                case "4" -> {
                    System.out.println("Đăng xuất");
                    menu(listAll);
                }
                case "0" -> System.exit(1);
            }
        } while (true);

    }
}


