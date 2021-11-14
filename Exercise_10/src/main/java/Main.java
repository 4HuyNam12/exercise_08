import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        ArrayList<Product> listProduct = repo.getData();
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
        sc.nextLine();
        switch (n) {
            case 1:
                System.out.println("Thông tin tất cả các sản phẩm: ");
                repo.printList(listProduct);
                break;
            case 2:
                System.out.println("Thông tin các sản phẩm có giá hơn 1 triệu: ");
                repo.findProductByPrice(listProduct);
                break;
            case 3:
                System.out.println("sắp xếp sản phẩm theo số lượng bán được: ");
                repo.sortByQuantitySold(listProduct);
                break;
            case 4:
                System.out.println("Thông tin sản phẩm bán chạy nhất: ");
                repo.findBestQuantitySold(listProduct);
                break;
            case 5:
                Category listCategory = new Category();
                listCategory.printListByCategory(CategoryEnum.COSMETICS);
                System.out.println();
                listCategory.printListByCategory(CategoryEnum.HOUSEWARE );
                System.out.println();
                listCategory.printListByCategory(CategoryEnum.FOOD);
                System.out.println();
                listCategory.printListByCategory(CategoryEnum.FASHION);
                break;
            case 6:
                System.out.println("Mời bạn nhập tên sản phẩm cần tìm: ");
                String name = sc.nextLine();
                ArrayList<Product> listByName = repo.findProductByName(name);
                if (listByName.isEmpty()) {
                    System.out.println("Không tìm thấy sản phẩm: " + name);
                } else {
                    System.out.println("Tìm thấy sản phẩm: " + name);
                    repo.printList(listByName);
                }
                break;
            case 0:
                System.exit(1);
        }
    }
}


