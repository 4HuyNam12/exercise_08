import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        Category category= new Category();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Mời bạn chọn chương trình:");
            System.out.println("1-In thông tin sản phẩm theo danh mục.");
            System.out.println("2-In thông tin sản phẩm theo hãng.");
            System.out.println("3-In thông tin sản phẩm theo mức giá.");
            System.out.println("4-Tìm kiếm thông tin sản phẩm theo tên.");
            choice = sc.nextInt();
            sc.nextLine();
        } while (choice > 4);
        switch (choice) {
            case 1:
                System.out.println("Mời bạn chọn danh mục sản phẩm");
                System.out.println("1-Điện thoại");
                System.out.println("2-Apple");
                System.out.println("3-Laptop");
                System.out.println("4-Phụ Kiện");
                int choiceCategory = sc.nextInt();
                if (choiceCategory == 1) {
                    System.out.println("Thông tin sản phẩm theo danh mục: ĐIỆN_THOẠI");
                    ArrayList<Product> listPhone =category.listByCategory(CategoryEnum.ĐIỆN_THOẠI);
                    repo.printList(listPhone);
                } else if (choiceCategory == 2) {
                    System.out.println("Thông tin sản phẩm theo danh mục: APPLE");
                    ArrayList<Product> listAPPLE =category.listByCategory(CategoryEnum.APPLE);
                    repo.printList(listAPPLE);
                } else if (choiceCategory == 3) {
                    System.out.println("Thông tin sản phẩm theo danh mục: LAPTOP");
                    ArrayList<Product> listPhone =category.listByCategory(CategoryEnum.LAPTOP);
                    repo.printList(listPhone);
                } else if (choiceCategory == 4) {
                    System.out.println("Thông tin sản phẩm theo danh mục: PHỤ_KIỆN");
                    ArrayList<Product> listAccessory =category.listByCategory(CategoryEnum.PHỤ_KIỆN);

                    repo.printList(listAccessory);
                } else {
                    System.out.println("Lựa chọn không phù hợp");
                }
                break;
            case 2:
                Brand brand = new Brand();
                System.out.println("Mời bạn chọn hãng");
                System.out.println("1-APPLE");
                System.out.println("2-SAMSUNG");
                System.out.println("3-XIAOMI");
                System.out.println("4-DELL");
                System.out.println("5-ASUS");
                System.out.println("6-OPPO");
                System.out.println("7-HUAWEI");

                int choiceBrand = sc.nextInt();
                if (choiceBrand == 1) {
                    System.out.println("Thông tin sản phẩm hãng APPLE");
                    ArrayList<Product> listApple=brand.listByBrand(BrandEnum.APPLE);
                    repo.printList(listApple);

                } else if (choiceBrand == 2) {
                    System.out.println("Thông tin sản phẩm hãng SAMSUNG");
                    ArrayList<Product> listSamSung = brand.listByBrand(BrandEnum.SAMSUNG);
                    repo.printList(listSamSung);
                } else if (choiceBrand == 3) {
                    System.out.println("Thông tin sản phẩm hãng XIAOMI");
                    ArrayList<Product> listXIAOMI = brand.listByBrand(BrandEnum.XIAOMI);
                    repo.printList(listXIAOMI);
                } else if (choiceBrand == 4) {
                    System.out.println("Thông tin sản phẩm hãng DELL");
                    ArrayList<Product> listDELL = brand.listByBrand(BrandEnum.DELL);
                    repo.printList(listDELL);
                } else if (choiceBrand == 5) {
                    System.out.println("Thông tin sản phẩm hãng ASUS");
                    ArrayList<Product> listASUS = brand.listByBrand(BrandEnum.ASUS);
                    repo.printList(listASUS);
                } else if (choiceBrand == 6) {
                    System.out.println("Thông tin sản phẩm hãng OPPO");
                    ArrayList<Product> listOPPO = brand.listByBrand(BrandEnum.OPPO);
                    repo.printList(listOPPO);
                } else if (choiceBrand == 7) {
                    System.out.println("Thông tin sản phẩm hãng HUAWEI");
                    ArrayList<Product> listHUAWEI = brand.listByBrand(BrandEnum.HUAWEI);
                    repo.printList(listHUAWEI);
                } else {
                    System.out.println("Lựa chọn không phù hợp");
                }
                break;

            case 3:
                System.out.println("Mời bạn lựa chọn thông tin mức giá :");
                System.out.println("1-Sản phẩm giá dưới 2 triệu đồng :");
                System.out.println("2-Sản phẩm giá từ 2 đến 4 triệu đồng :");
                System.out.println("3-Sản phẩm giá từ 4 đến 7 triệu đồng :");
                System.out.println("4-Sản phẩm giá từ 7 đến 13 triệu đồng :");
                System.out.println("5-Sản phẩm giá từ 13 triệu đồng trở lên :");
                int priceChoice = sc.nextInt();
                if (priceChoice == 1) {
                    System.out.println("Các sản phẩm giá dưới 2 triệu đồng :");
                    ArrayList<Product> priceBelow2M = repo.printProductByPrice(0,1900000);
                    repo.printList(priceBelow2M);

                } else if (priceChoice == 2) {
                    System.out.println("Các sản phẩm giá từ 2 đến 4 triệu đồng :");
                    ArrayList<Product> priceBelow2M = repo.printProductByPrice(2000000,4000000);
                    repo.printList(priceBelow2M);
                } else if (priceChoice == 3) {
                    System.out.println("Các sản phẩm giá từ 4 đến 7 triệu đồng :");
                    ArrayList<Product> priceFrom2to4M = repo.printProductByPrice(4000000,7000000);
                    repo.printList(priceFrom2to4M);
                } else if (priceChoice == 4) {
                    System.out.println("Các sản phẩm giá từ 7 đến 13 triệu đồng :");
                    ArrayList<Product> priceFrom4to7M = repo.printProductByPrice(7000000,13000000);
                    repo.printList(priceFrom4to7M);
                } else if (priceChoice == 5) {
                    System.out.println("Các sản phẩm giá trên 13 triệu đồng :");
                    ArrayList<Product> priceBelow2M = repo.printProductByPrice(13000000,1000000000);
                    repo.printList(priceBelow2M);
                } else {
                    System.out.println("Lựa chọn không phù hợp");
                    System.exit(1);
                }
                break;
            case 4:
                System.out.println("Nhập vào tên sản phẩm cần tìm kiếm: ");
                String name = sc.nextLine();
                ArrayList<Product> listByName = repo.findProDuctByName(name);
                if (!listByName.isEmpty()) {
                    System.out.println("Tìm thấy sản phẩm: " + name);
                    repo.printList(listByName);
                } else {
                    System.out.println("Không tìm thấy sản phẩm.");
                }
                break;
        }
    }
}



