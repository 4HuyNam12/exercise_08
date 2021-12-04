import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserService {
    Scanner sc = new Scanner(System.in);
    UserRepository repo = new UserRepository();
    MenuList menu = new MenuList();
    ArrayList<User> listAll = repo.listAll();
    String emailRegex = "^(.+)@(\\\\S+)$";
    String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;])(?=\\S+$).{7,15}$";
    public boolean login() {
        boolean ischeck = false;
        String userName =null;
        do {
            System.out.println("Nhập userName: ");
            userName = sc.nextLine();
            String password;
            for (User user : listAll) {
                if (userName.equals(user.getUserName())) {
                    System.out.println("Nhập password");
                    password = sc.nextLine();
                    if (password.equals(user.getPassword())) {
                        System.out.println("Chào mừng:" + userName);
                        ischeck = true;
                    }
                }
            }
        }while (!ischeck) ;
            return false;
       }



    public void forgotPassword() {
        System.out.println("Mời bạn nhập email đăng ký: ");
        String email = sc.nextLine();
        for (int i = 0; i < listAll.size(); i++) {
            if (email.equals(listAll.get(i).getEmail())) {
                System.out.println("Chào mừng :" + listAll.get(i).getUserName());
                System.out.println("Mời bạn nhập mật khẩu mới: ");
                String password = sc.nextLine();
                listAll.get(i).setPassword(password);
            } else {
                System.out.println("Chưa tồn tại tài khoản");
            }
        }
    }

    public void createNewAccount() {
        String userName = enterUsername();
        String email=enterEmail();
        String password=null;
            for (int i = 0; i < listAll.size(); i++) {
                if (email.equals(listAll.get(i).getEmail())) {
                    System.out.println("email đã được sử dụng , mời bạn nhập email khác");
                }else
                    password=enterPassword();
            }
        listAll.add(new User(userName,email,password));
    }
    public String enterUsername() {
        System.out.println("Mời bạn nhập tên tài khoản:");
        return sc.nextLine();
    }
    public String enterPassword() {
        boolean ischeck = false;
        String password =null;
        do {
            try {
                System.out.println("Mời bạn nhập mật khẩu:");
                 password = sc.nextLine();
                if (!Pattern.matches(password, passwordRegex)) throw new Exception("Sai định dạng mật khẩu , vui lòng nhập lại") ;
                ischeck = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(!ischeck);
        return password;
    }
    public String enterEmail() {
        String email=null ;
        boolean ischeck = false;
        do {
            try {
                System.out.println("Mời bạn nhập email:");
                email = sc.nextLine();
                if (!Pattern.matches(email, emailRegex)) throw new Exception("Sai định dạng email , vui lòng nhập lại") ;
                ischeck = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(!ischeck);
        return email;

    }
    public void changeEmail(String userName) {
        String enterEmail = enterEmail();
        for (User user : listAll) {
            if (userName.equals(user.getUserName())) {
                user.setEmail(enterEmail);
            }
        }
    }
    public void changePassword(String userName) {
        String password = enterPassword();
        for (User user : listAll) {
            if (userName.equals(user.getUserName())) {
                user.setPassword(password);
            }
        }
    }

    public void changeUser(String userName) {
        String newUserName = enterUsername();
        for (User user : listAll) {
            if (userName.equals(user.getUserName())) {
                user.setUserName(newUserName);
            }

        }
    }
}

