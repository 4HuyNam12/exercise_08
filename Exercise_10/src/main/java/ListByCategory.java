import java.util.ArrayList;
import java.util.Scanner;

public class ListByCategory {

    public ProductRepository repo = new ProductRepository();
    ArrayList<Product> listByCategory = repo.getData();
    ArrayList<Product> houseware = new ArrayList<>();
    ArrayList<Product> fashion = new ArrayList<>();
    ArrayList<Product> food = new ArrayList<>();
    ArrayList<Product> comistic = new ArrayList<>();
    ArrayList<Product> listByName = new ArrayList<>();

    public void printListByCategory() {
        System.out.println("Thông tin sản phẩm theo danh mục COSMETICS:");
        for (Product product : listByCategory) {
            if (product.getCategory().equals(Catergory.COSMETICS)) {
                comistic.add(product);
            }
        }
        for (Product p : comistic) {
            System.out.println(p);

        }
        System.out.println("\nThông tin sản phẩm theo danh mục FASHION:");
        for (Product product : listByCategory) {
            if (product.getCategory().equals(Catergory.FASHION)) {
                fashion.add(product);
            }
        }
        for (Product p : fashion) {
            System.out.println(p);
        }
        System.out.println("\nThông tin sản phẩm theo danh mục FOOD:");
        for (Product product : listByCategory) {
            if (product.getCategory().equals(Catergory.FOOD)) {
                food.add(product);
            }
        }
        for (Product p : food) {
            System.out.println(p);
        }
        System.out.println("\nThông tin sản phẩm theo danh mục HOUSEWARE:");
        for (Product product : listByCategory) {
            if (product.getCategory().equals(Catergory.HOUSEWARE)) {
                houseware.add(product);
            }
        }
        for (Product p : houseware) {
            System.out.println(p);
        }

    }

    public boolean isCheckProductByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên sản phẩm cần tìm kiếm");
        String name = sc.nextLine();
        for (Product product : listByCategory) {
            if (name.equalsIgnoreCase(product.getName())) {
                System.out.println(product);
                return true;

            }
        }
        return false;
    }
}



