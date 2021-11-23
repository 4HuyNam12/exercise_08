
public class Main {
    public static void main(String[] args) {
        Information info = new Information();
        System.out.println("Nhập vào họ và tên: ");
        String fullName = info.inputFullName();
        System.out.println("Nhập vào năm sinh: ");
        int yearOfBirth = info.inputYearOfBirth();
        System.out.println("Nhập vào địa chỉ: ");
        String address = info.inputAddress();
        info.display(fullName, yearOfBirth, address);
        info.calculateAge();
    }
}
