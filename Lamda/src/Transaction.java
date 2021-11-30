import java.util.Scanner;
import java.util.regex.Pattern;

public class Transaction {
    Scanner sc = new Scanner(System.in);
    public long enterAccountNumber() {
        long accountNumber = 0;
        boolean ischeck = false;
        while (!ischeck) {
            try {
                System.out.println("Nhập số tài khoản:");
                String accountString = sc.nextLine();
                if (Pattern.matches("^[0-9]{8,16}$", accountString)) {
                    accountNumber = Integer.parseInt(accountString);
                } else {
                    throw new Exception();
                }
                ischeck = true;
            } catch (Exception e) {
                System.out.println("Số tài khoản không đúng định dạng,mời nhập lại");
            }
        }
        return accountNumber;
    }

    public long enterMoneyNumber(Long accountBalance) {
        boolean ischeck = false;
        long moneyNumber = 0;
        while (!ischeck) {
            try {
                System.out.println("Nhập số tiền bạn muốn chuyển :");
                moneyNumber = Long.parseLong(sc.nextLine());
                if (moneyNumber < 50000 || moneyNumber > accountBalance - 50000)
                    throw new Exception();
                ischeck = true;
            } catch (Exception e) {
                System.out.println("Số tiền không hợp lệ,mời nhập lại");
            }
        }
        return moneyNumber;
    }

    public String enterDescription() {
        System.out.println("Nhập vào nội dung chuyển tiền: ");
        return sc.nextLine();
    }
}
