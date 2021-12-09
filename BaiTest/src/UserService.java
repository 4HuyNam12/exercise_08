import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    Scanner sc = new Scanner(System.in);
    String userName;
    String email;
    String password;
    Input input = new Input();

    public String login(ArrayList<User> listAll) {
        boolean checklogin = false;
        listAll.stream().forEach(System.out::println);
        while (!checklogin) {
            userName = input.enterUsername();
            int count = 0;
            for (int i = 0; i < listAll.size(); i++) {
                if (userName.equals(listAll.get(i).getUserName())) {
                    count++;
                    System.out.println("Nhập mật khẩu: ");
                    password = sc.nextLine();
                    if (!password.equals(listAll.get(i).getPassword())) {
                        System.out.println("Bạn đã nhập sai mật khẩu");
                        System.out.println("Mời lựa chọn");
                        System.out.println("1-Đăng nhập lại");
                        System.out.println("2-Quên mật khẩu");
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1 -> System.out.println("Đăng nhập lại");
                            case 2 -> forgotPassword(listAll);
                        }
                    } else {
                        System.out.println("Chào mừng: " + userName);
                        checklogin = true;
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Bạn đã nhập sai userName");
            }
        }
        return userName;
    }

    public void forgotPassword(ArrayList<User> listAll) {
        MenuList menuList = new MenuList();
        System.out.println("Mời bạn nhập email đăng ký: ");
        email = sc.nextLine();
        int count = 0;
        for (User user : listAll) {
            if (email.equals(user.getEmail())) {
                System.out.println("Chào mừng :" + user.getUserName());
                System.out.println("Mời bạn nhập mật khẩu mới: ");
                password = input.enterPassword();
                System.out.println("Thay đổi mật khẩu thành công.");
                user.setUserName(user.getUserName());
                user.setEmail(email);
                user.setPassword(password);
                menuList.menu(listAll);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Chưa tồn tại tài khoản!");
        }
    }

    public void createNewAccount(ArrayList<User> listAll) {
        userName = input.enterUsername();
        boolean ischeck = false;
        do {
            email = input.enterEmail();
            for (User user : listAll) {
                if (email.equals(user.getEmail())) {
                    System.out.println("email đã được sử dụng , vui lòng nhập lại.");
                    ischeck = false;
                } else {
                    ischeck = true;
                }
            }
        } while (!ischeck);
        System.out.println("Mời bạn nhập mật khẩu: ");
        password = input.enterPassword();
        System.out.println("Chúc mừng bạn đã đăng ký thành công !");
        listAll.add(new User(userName, email, password));
    }


    public void changeEmail(String userName, ArrayList<User> listAll) {
        String enterEmail = input.enterEmail();
        for (User user : listAll) {
            if (userName.equals(user.getUserName())) {
                user.setEmail(enterEmail);
            }
        }
    }

    public void changePassword(String userName, ArrayList<User> listAll) {
        System.out.println("Mời bạn nhập mật khẩu mới: ");
        String password = input.enterPassword();
        for (User user : listAll) {
            if (userName.equals(user.getUserName())) {
                user.setPassword(password);
            }
        }
    }

    public void changeUser(String userName, ArrayList<User> listAll) {
        String newUserName = input.enterUsername();
        for (User user : listAll) {
            if (userName.equals(user.getUserName())) {
                user.setUserName(newUserName);
            }
        }
    }

}

