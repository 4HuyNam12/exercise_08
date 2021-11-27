import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        Category category = new Category();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Mời bạn chọn chương trình:");
            System.out.println("1-In thông tin sản phẩm và liệt kê số lượng sản phẩm theo danh mục.");
            System.out.println("2-In thông tin sản phẩm và liệt kê số lượng sản phẩm theo hãng.");
            System.out.println("3-In thông tin sản phẩm theo mức giá.");
            System.out.println("4-Tìm kiếm thông tin sản phẩm theo tên.");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Lựa chọn phải là số nguyên , xin hãy chọn lại!");
            }
        } while (choice > 4 || choice <= 0);
        switch (choice) {
            case 1:
                int choiceCategory = 0;
                do {
                    System.out.println("Mời bạn chọn danh mục sản phẩm");
                    System.out.println("1-Điện thoại");
                    System.out.println("2-Apple");
                    System.out.println("3-Laptop");
                    System.out.println("4-Phụ Kiện");
                    try {
                        choiceCategory = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Lựa chọn phải là số nguyên , xin hãy chọn lại!");
                    }
                } while (choiceCategory <= 0 || choiceCategory > 4);
                if (choiceCategory == 1) {
                    System.out.println("Thông tin sản phẩm theo danh mục: ĐIỆN_THOẠI");
                    ArrayList<Product> listPhone = category.listByCategory(CategoryEnum.ĐIỆN_THOẠI);
                    System.out.println("Số lượng sản phẩm theo danh mục ĐIỆN_THOẠI: " + listPhone.size());
                    repo.printList(listPhone);
                } else if (choiceCategory == 2) {
                    System.out.println("Thông tin sản phẩm theo danh mục: APPLE");
                    ArrayList<Product> listAPPLE = category.listByCategory(CategoryEnum.APPLE);
                    System.out.println("Số lượng sản phẩm danh mục APPLE: " + listAPPLE.size());
                    repo.printList(listAPPLE);
                } else if (choiceCategory == 3) {
                    System.out.println("Thông tin sản phẩm theo danh mục: LAPTOP");
                    ArrayList<Product> listLAPTOP = category.listByCategory(CategoryEnum.LAPTOP);
                    System.out.println("Số lượng sản phẩm danh mục LAPTOP: " + listLAPTOP.size());
                    repo.printList(listLAPTOP);
                } else {
                    System.out.println("Thông tin sản phẩm theo danh mục: PHỤ_KIỆN");
                    ArrayList<Product> listAccessory = category.listByCategory(CategoryEnum.PHỤ_KIỆN);
                    System.out.println("Số lượng sản phẩm theo danh mục PHỤ_KIỆN: " + listAccessory.size());
                    repo.printList(listAccessory);
                }
                break;
            case 2:
                Brand brand = new Brand();
                int choiceBrand = 0;
                do {
                    System.out.println("Mời bạn chọn hãng");
                    System.out.println("1-APPLE");
                    System.out.println("2-SAMSUNG");
                    System.out.println("3-XIAOMI");
                    System.out.println("4-DELL");
                    System.out.println("5-ASUS");
                    System.out.println("6-OPPO");
                    System.out.println("7-HUAWEI");
                    try {
                        choiceBrand = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Lựa chọn phải là số nguyên , xin hãy chọn lại!");
                    }
                } while (choiceBrand <= 0 || choiceBrand > 7);
                if (choiceBrand == 1) {
                    ArrayList<Product> listApple = brand.listByBrand(BrandEnum.APPLE);
                    System.out.println("Thông tin sản phẩm hãng APPLE");
                    System.out.println("Số lượng sản phẩm của hãng APPLE: " + listApple.size());
                    repo.printList(listApple);
                } else if (choiceBrand == 2) {
                    ArrayList<Product> listSamSung = brand.listByBrand(BrandEnum.SAMSUNG);
                    System.out.println("Thông tin sản phẩm hãng SAMSUNG");
                    System.out.println("Số lượng sản phẩm của hãng SAMSUNG: " + listSamSung.size());
                    repo.printList(listSamSung);
                } else if (choiceBrand == 3) {
                    ArrayList<Product> listXIAOMI = brand.listByBrand(BrandEnum.XIAOMI);
                    System.out.println("Thông tin sản phẩm hãng XIAOMI");
                    System.out.println("Số lượng sản phẩm của hãng XIAOMI: " + listXIAOMI.size());
                    repo.printList(listXIAOMI);
                } else if (choiceBrand == 4) {
                    ArrayList<Product> listDELL = brand.listByBrand(BrandEnum.DELL);
                    System.out.println("Thông tin sản phẩm hãng DELL");
                    System.out.println("Số lượng sản phẩm của hãng DELL: " + listDELL.size());
                    repo.printList(listDELL);
                } else if (choiceBrand == 5) {
                    ArrayList<Product> listASUS = brand.listByBrand(BrandEnum.ASUS);
                    System.out.println("Thông tin sản phẩm hãng ASUS");
                    System.out.println("Số lượng sản phẩm của hãng ASUS: " + listASUS.size());
                    repo.printList(listASUS);
                } else if (choiceBrand == 6) {
                    ArrayList<Product> listOPPO = brand.listByBrand(BrandEnum.OPPO);
                    System.out.println("Thông tin sản phẩm hãng OPPO");
                    System.out.println("Số lượng sản phẩm của hãng OPPO: " + listOPPO.size());
                    repo.printList(listOPPO);
                } else {
                    ArrayList<Product> listHUAWEI = brand.listByBrand(BrandEnum.HUAWEI);
                    System.out.println("Thông tin sản phẩm hãng HUAWEI");
                    System.out.println("Số lượng sản phẩm của hãng HUAWEI: " + listHUAWEI.size());
                    repo.printList(listHUAWEI);
                }
                break;
            case 3:
                int priceChoice = 0;
                do {
                    System.out.println("Mời bạn lựa chọn thông tin mức giá :");
                    System.out.println("1-Sản phẩm giá dưới 2 triệu đồng :");
                    System.out.println("2-Sản phẩm giá từ 2 đến 4 triệu đồng :");
                    System.out.println("3-Sản phẩm giá từ 4 đến 7 triệu đồng :");
                    System.out.println("4-Sản phẩm giá từ 7 đến 13 triệu đồng :");
                    System.out.println("5-Sản phẩm giá từ 13 triệu đồng trở lên :");
                    try {
                        priceChoice = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Lựa chọn phải là số nguyên , xin hãy chọn lại!");
                    }
                } while (priceChoice <= 0 || priceChoice > 5);
                System.out.println("Mời bạn lựa chọn thông tin mức giá :");
                System.out.println("1-Sản phẩm giá dưới 2 triệu đồng :");
                System.out.println("2-Sản phẩm giá từ 2 đến 4 triệu đồng :");
                System.out.println("3-Sản phẩm giá từ 4 đến 7 triệu đồng :");
                System.out.println("4-Sản phẩm giá từ 7 đến 13 triệu đồng :");
                System.out.println("5-Sản phẩm giá từ 13 triệu đồng trở lên :");
                if (priceChoice == 1) {
                    System.out.println("Các sản phẩm giá dưới 2 triệu đồng :");
                    ArrayList<Product> priceBelow2M = repo.printProductByPrice(0, 1900000);
                    repo.printList(priceBelow2M);
                } else if (priceChoice == 2) {
                    System.out.println("Các sản phẩm giá từ 2 đến 4 triệu đồng :");
                    ArrayList<Product> priceBelow2M = repo.printProductByPrice(2000000, 4000000);
                    repo.printList(priceBelow2M);
                } else if (priceChoice == 3) {
                    System.out.println("Các sản phẩm giá từ 4 đến 7 triệu đồng :");
                    ArrayList<Product> priceFrom2to4M = repo.printProductByPrice(4000000, 7000000);
                    repo.printList(priceFrom2to4M);
                } else if (priceChoice == 4) {
                    System.out.println("Các sản phẩm giá từ 7 đến 13 triệu đồng :");
                    ArrayList<Product> priceFrom4to7M = repo.printProductByPrice(7000000, 13000000);
                    repo.printList(priceFrom4to7M);
                } else {
                    System.out.println("Các sản phẩm giá trên 13 triệu đồng :");
                    ArrayList<Product> priceBelow2M = repo.printProductByPrice(13000000, 1000000000);
                    repo.printList(priceBelow2M);
                }
                break;
            case 4:
                System.out.println("Nhập vào tên sản phẩm cần tìm kiếm: ");
                String name = sc.nextLine();
                ArrayList<Product> listByName = repo.findProDuctByName(name);
                if (!listByName.isEmpty()) {
                    System.out.println("Tìm thấy " + listByName.size() + " sản phẩm có chứa: " + "\"" + name + "\"");
                    repo.printList(listByName);
                } else {
                    System.out.println("Không tìm thấy sản phẩm.");
                }
                break;
        }
    }
}




