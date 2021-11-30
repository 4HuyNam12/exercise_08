import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Transaction transaction = new Transaction();
    TransactionHistory transactionHistory = new TransactionHistory();
    long accountBalance = 5000000;
    String description = null;
    long accountNumber = 0;
    long moneyNumber = 0;
    Map<Integer, TransactionHistory> mapHistory = new HashMap<>();

    public void menuList() {
        String menu = """
                Mời bạn lựa chọn:
                1- Truy vấn số dư tài khoản.
                2- Chuyển tiền.
                3- Xem lịch sử giao dịch
                0-Thoát chương trình""";
        int choice = 0;
        do {
            System.out.println(menu);
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Lựa chọn phải là số nguyên , xin hãy chọn lại!");
            }
            subMenuList(choice);
        } while (choice != 0);

    }

    public void subMenuList(int choice) {
        switch (choice) {
            case 1 -> System.out.println("Số dư tài khoản của bạn là " + accountBalance);
            case 2 -> {
                System.out.println("Nhập vào tên ngân hàng muốn chuyển đến: ");
                String bankName = sc.nextLine();
                description = transaction.enterDescription();
                accountNumber = transaction.enterAccountNumber();
                moneyNumber = transaction.enterMoneyNumber(accountBalance);
                int confirm = 0;
                do {
                    System.out.println("""
                            Thực hiện chuyển tiền:
                            1- Đồng ý
                            2- Hủy bỏ giao dịch""");
                    try {
                        confirm = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Lựa chọn không đúng , xin hãy chọn lại!");
                    }
                } while (confirm > 2 || confirm <= 0);
                if (confirm == 1) {
                    System.out.println("Chuyển tiền thành công ,giao dịch đã được lưu vào lịch sử giao dịch");
                    mapHistory = transactionHistory.addTransactionHistory(description, accountNumber, moneyNumber);
                    accountBalance -= moneyNumber;
                } else {
                    System.out.println("Hủy bỏ giao dịch");
                    System.exit(1);
                }
            }
            case 3 -> {
                if (mapHistory.isEmpty()) {
                    System.out.println("Lịch sử giao dịch trống ,hãy thực hiện giao dịch");
                } else {
                    System.out.println("Lịch sử giao dịch:");
                    mapHistory.forEach((key, value) -> System.out.println(key + " - " + value));
                }
            }
        }
    }
}
