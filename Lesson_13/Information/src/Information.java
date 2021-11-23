import java.time.LocalDate;
import java.util.Scanner;

public class Information {
    Scanner sc = new Scanner(System.in);
    int yearOfBirth;

    public String inputFullName() {
        return sc.nextLine();
    }

    public int inputYearOfBirth() {
        boolean ischeck = false;
        while (!ischeck) {
            try {
                yearOfBirth = Integer.parseInt(sc.nextLine());
                if (yearOfBirth < 1900 || yearOfBirth > 2021)
                    throw new MyException("Năm sinh không hợp lệ ,(Năm sinh từ 1900 đến 2021) \nNhập lại năm sinh: ");
                ischeck = true;
            } catch (MyException exceptions) {
                System.out.println(exceptions.getMessage());
            } catch (NumberFormatException exceptions) {
                System.out.println("Năm sinh phải là một số nguyên\nNhập lại năm sinh:");
            }
//        }
        }
        return yearOfBirth;
    }

    public String inputAddress() {
        return sc.nextLine();
    }

    public void display(String fullName, int yearOfBirth, String address) {
        System.out.println("Họ và Tên: " + fullName + " - " + "Năm sinh: " + yearOfBirth + " - " + "Địa chỉ: " + address + ".");
    }

    public void calculateAge() {
        LocalDate localDate = LocalDate.now();
        int age = localDate.getYear() - yearOfBirth;
        if (age >= 18) {
            System.out.println("Bạn đã " + age + " tuổi . Mời bạn đi bầu cử.");
        } else {
            System.out.println("Bạn chưa đủ 18 tuổi . Bạn có thể đi bầu cử sau khi đủ 18 tuổi.");
        }
    }
}



