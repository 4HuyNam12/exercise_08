import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
         validateEmail();
    }
    public static void validateEmail(){
        System.out.println("Nhập vào email của bạn: ");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String emailPattern ="^(.+)@(.+)$";
        if (Pattern.matches(emailPattern, email)) {
            System.out.println("Email bạn nhập đã đúng định dạng");
        }else{
            System.out.println("Email bạn nhập không đúng định dạng");
        }
    }
}

