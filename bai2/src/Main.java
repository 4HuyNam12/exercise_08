public class Main {

    public static void main(String[] args) {
        String nameAfter = ChuanHoaTen.chuanHoaTenRieng(ChuanHoaTen.inputName());
        System.out.println("Tên của bạn sau khi chuẩn hóa là: " + nameAfter);
        String str =Palindrome.inputString();
        boolean result =Palindrome.checkPalindrome(str);
        if (result) {
            System.out.println("Chuỗi bạn nhập là chuỗi Palindrome");
        } else {
            System.out.println("Chuỗi bạn nhập không phải là chuỗi Palindrome" );
        }

    }
}
