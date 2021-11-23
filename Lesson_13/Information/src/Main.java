
public class Main {
    public static void main(String[] args) {
        Information infor = new Information();
        System.out.println("Nhập vào họ và tên: ");
        String fullName = infor.inputFullName();
        System.out.println("Nhập vào năm sinh: ");
        int yearOfBirth = infor.inputYearOfBirth();
        System.out.println("Nhập vào địa chỉ: ");
        String address = infor.inputAddress();
        infor.display(fullName, yearOfBirth, address);
        infor.calculateAge(yearOfBirth);
    }
}
