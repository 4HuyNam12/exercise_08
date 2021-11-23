import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        boolean isCheck = false;
        while (!isCheck) {
            try {
                System.out.println("Nhập vào độ dài cạnh thứ nhất: ");
                double a = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập vào độ dài cạnh thứ hai: ");
                double b = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập vào cạnh thứ ba: ");
                double c = Double.parseDouble(sc.nextLine());
                triangle.checkTriangle(a,b,c);
                isCheck =true;
            } catch (MyExceptions exceptions) {
                System.out.println(exceptions.getMessage());
                System.out.println("Xin mời nhập lại độ dài");
            } catch (NumberFormatException exceptions) {
                System.out.println("Độ dài cạnh tam giác phải là một số");
                System.out.println("Xin mời nhập lại độ dài");
            }
        }
    }

}
