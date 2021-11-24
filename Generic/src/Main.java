import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repository repo = new Repository();
        ArrayList<? extends Employee> listEmployees;
        String listChoices = "Mời lựa chọn chương trình :\n" +
                "1: Quản lý danh sách bồi bàn.\n" +
                "2: Quản lý danh sách nhân viên đứng bếp.\n" +
                "3: Thoát chương trình\n" +
                "      Lựa chọn:";
        int choose = 0;
        boolean ischeck = false;
        System.out.println(listChoices);
        while (!ischeck) {
            try {
                choose = Integer.parseInt(scanner.nextLine());
                if (choose<=0 || choose>=4) { throw new Exception();
                }
                ischeck = true;
            } catch (Exception e) {
                System.out.println("Lựa chọn phải là 1 số nguyên từ 1 đến 3");
                System.out.println(listChoices);
            }
        }
        switch (choose) {
            case 1:
                System.out.println("Quản lý danh sách waiters: ");
                listEmployees = repo.getAllWaiter();
                repo.printList(listEmployees);
                break;
            case 2:
                System.out.println("\nQuản lý danh sách kichen: ");
                listEmployees = repo.getAllKitchen();
                repo.printList(listEmployees);
                break;
            case 3:
                System.out.println("Thoát chương trình");
                System.exit(1);
                break;
        }
    }
}






