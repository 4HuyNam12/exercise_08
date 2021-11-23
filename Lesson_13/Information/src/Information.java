import java.util.Scanner;

public class Information {
    Scanner sc = new Scanner(System.in);

    public String inputFullName() {
        String fullName = sc.nextLine();
        return fullName;
    }

    public int inputYearOfBirth() {
        int yearOfBirth = 0;
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
                System.out.println("Năm sinh phải là một số nguyên");
                System.out.println("Mời bạn nhập lại năm sinh:");
            }
//        }
        }
        return yearOfBirth;
    }

    public String inputAddress() {
        String address = sc.nextLine();
        return address;
    }

    public void display(String fullName, int yearOfBirth, String address) {
        System.out.println("Họ và Tên: " + fullName + " - " + "Năm sinh: " + yearOfBirth + " - " + "Địa chỉ: " + address + ".");
    }

    public void calculateAge(int yearOfBirth) {
        int age = 2021 - yearOfBirth;
        if (age >= 18) {
            System.out.println("Bạn đã: " + age + "tuổi , Mời bạn đi bầu cử");
        } else {
            System.out.println("Bạn chưa đủ 18 tuổi , Bạn có thể đi bầu cử sau khi đủ 18 tuổi");
        }
    }
}



