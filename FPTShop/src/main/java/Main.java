import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        Category category = new Category();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Mời bạn chọn chương trình:");
            System.out.println("1-In thông tin sản phẩm theo danh mục.");
            System.out.println("2-In thông tin sản phẩm theo hãng.");
            System.out.println("3-In thông tin sản phẩm theo mức giá và danh mục.");
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
                    repo.printList(category.listByPhone());
                } else if (choiceCategory == 2) {
                    System.out.println("Thông tin sản phẩm theo danh mục: APPLE");
                    repo.printList(category.listByApple());
                } else if (choiceCategory == 3) {
                    System.out.println("Thông tin sản phẩm theo danh mục: LAPTOP");
                    repo.printList(category.listByLapTop());
                } else if (choiceCategory == 4) {
                    System.out.println("Thông tin sản phẩm theo danh mục: PHỤ_KIỆN");
                    repo.printList(category.listByAccessory());
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
                    repo.printList(brand.listByApple());

                } else if (choiceBrand == 2) {
                    System.out.println("Thông tin sản phẩm hãng SAMSUNG");
                    brand.listBySamSung();
                } else if (choiceBrand == 3) {
                    System.out.println("Thông tin sản phẩm hãng XIAOMI");
                    brand.listByXiaomi();
                } else if (choiceBrand == 4) {
                    System.out.println("Thông tin sản phẩm hãng DELL");
                    brand.listByDeLL();
                } else if (choiceBrand == 5) {
                    System.out.println("Thông tin sản phẩm hãng ASUS");
                    brand.listByASUS();
                } else if (choiceBrand == 6) {
                    System.out.println("Thông tin sản phẩm hãng OPPO");
                    brand.listByOPPO();
                } else if (choiceBrand == 7) {
                    System.out.println("Thông tin sản phẩm hãng HUAWEI");
                    brand.listByHuawei();
                } else {
                    System.out.println("Lựa chọn không phù hợp");
                }
                break;

            case 3:
                ProductPrice productByPrice = new ProductPrice();
                System.out.println("Mời bạn lựa chọn thông tin mức giá :");
                System.out.println("1-Sản phẩm giá dưới 2 triệu đồng :");
                System.out.println("2-Sản phẩm giá từ 2 đến 4 triệu đồng :");
                System.out.println("3-Sản phẩm giá từ 4 đến 7 triệu đồng :");
                System.out.println("4-Sản phẩm giá từ 7 đến 13 triệu đồng :");
                System.out.println("5-Sản phẩm giá từ 13 triệu đồng trở lên :");
                int priceChoice = sc.nextInt();
                if (priceChoice == 1) {
                    System.out.println("Các sản phẩm giá dưới 2 triệu đồng :");
                    repo.printList(productByPrice.printPriceBelow2M());

                } else if (priceChoice == 2) {
                    System.out.println("Các sản phẩm giá từ 2 đến 4 triệu đồng :");
                    repo.printList(productByPrice.printPriceFrom2to4M());
                } else if (priceChoice == 3) {
                    System.out.println("Các sản phẩm giá từ 4 đến 7 triệu đồng :");
                    repo.printList(productByPrice.printPriceFrom4to7M());
                } else if (priceChoice == 4) {
                    System.out.println("Các sản phẩm giá từ 7 đến 13 triệu đồng :");
                    repo.printList(productByPrice.printPriceFrom7to13m());
                } else if (priceChoice == 5) {
                    System.out.println("Các sản phẩm giá trên 13 triệu đồng :");
                    repo.printList(productByPrice.printPriceUp13M());
                } else {
                    System.out.println("Lựa chọn không phù hợp");
                    System.exit(1);
                }
                break;
            case 4:
                System.out.println("Nhập vào tên sản phẩm cần tìm kiếm: ");
                String name = sc.nextLine();
                boolean ischeck = category.findProDuctByName(name);
                if (ischeck) {
                    System.out.println("Tìm thấy sản phẩm: " + name);
                    repo.printList(category.listByName);
                } else {
                    System.out.println("Không tìm thấy sản phẩm.");
                }
                break;
        }
    }
}



