import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        ArrayList<Product> listProduct = repo.getData();
        ListByCategory listCategory = new ListByCategory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn 1 trong các chương trình sau: ");
        System.out.println("1-In thông tin tất cả các sản phẩm ra màn hình");
        System.out.println("2-In thông tin các sản phẩm có giá lớn hơn 1,000,000");
        System.out.println("3-Sắp xếp sản phẩm theo số lượng bán được");
        System.out.println("4-Lấy ra sản phẩm bán chạy nhất");
        System.out.println("5-In thông tin sản phẩm theo danh mục");
        System.out.println("6-Tìm kiếm sản phẩm theo tên");
        System.out.println("0-Thoát chương trình");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("Thông tin tất cả các sản phẩm: ");
                repo.printList(listProduct);
            }
            case 2 -> {
                System.out.println("Thông tin các sản phẩm có giá hơn 1 triệu: ");
                repo.findProductByPrice(listProduct);
            }
            case 3 -> {
                System.out.println("sắp xếp sản phẩm theo số lượng bán được: ");
                repo.sortByQuantitySold(listProduct);
            }
            case 4 -> {
                System.out.println("Thông tin sản phẩm bán chạy nhất: ");
                repo.findBestQuantitySold(listProduct);
            }
            case 5 -> listCategory.printListByCategory();
            case 6 -> {
                boolean isCheck = listCategory.isCheckProductByName();
                {
                    if (!isCheck) {
                        System.out.println("Không tìm thấy sản phẩm");
                    }
                }
            }
            case 0 -> System.exit(1);
        }
    }
}


