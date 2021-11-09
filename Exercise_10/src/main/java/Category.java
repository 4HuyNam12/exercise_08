import java.util.ArrayList;

public class Category {

    public ProductRepository repo = new ProductRepository();
    ArrayList<Product> listByCategory = repo.getData();
    ArrayList<Product> houseware = new ArrayList<>();
    ArrayList<Product> fashion = new ArrayList<>();
    ArrayList<Product> food = new ArrayList<>();
    ArrayList<Product> comistic = new ArrayList<>();

    public void printListByCategory() {
        for (Product product : listByCategory) {
            if (product.getCategory().equals(CategoryEnum.COSMETICS)) {
                comistic.add(product);
            }
            if (product.getCategory().equals(CategoryEnum.FASHION)) {
                fashion.add(product);
            }
            if (product.getCategory().equals(CategoryEnum.FOOD)) {
                food.add(product);
            }
            if (product.getCategory().equals(CategoryEnum.HOUSEWARE)) {
                houseware.add(product);
            }
        }
        System.out.println("Thông tin sản phẩm theo danh mục COSMETICS:");
        for (Product p : comistic) {
            System.out.println(p);
        }
        System.out.println("\nThông tin sản phẩm theo danh mục FASHION:");
        for (Product p : fashion) {
            System.out.println(p);
        }
        System.out.println("\nThông tin sản phẩm theo danh mục FOOD:");
        for (Product p : food) {
            System.out.println(p);
        }
        System.out.println("\nThông tin sản phẩm theo danh mục HOUSEWARE:");
        for (Product p : houseware) {
            System.out.println(p);
        }
    }
}




