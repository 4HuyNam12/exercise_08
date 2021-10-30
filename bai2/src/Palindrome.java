import java.util.Scanner;

public class Palindrome {
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ");
        String str = sc.nextLine();
        System.out.println("Chuỗi bạn đã nhập là: " + str);
        return str;
    }

    public static boolean checkPalindrome(String str) {
        char kyTu;
        for (int i = 0; i < str.length(); i++) {
            kyTu = str.charAt(i);
            if (kyTu == str.charAt(str.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }
}