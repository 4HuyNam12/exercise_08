import java.util.ArrayList;

public class Category {

    public ProductRepository repo = new ProductRepository();
    ArrayList<Product> listByCategory = repo.getData();
    ArrayList<Product> products = new ArrayList<>();

    public void printListByCategory(CategoryEnum category) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : listByCategory) {
            if (product.getCategory().equals(category)) {
                products.add(product);
            }
        }
        System.out.println("Thông tin sản phẩm theo danh mục: " + category);
        for (Product p : products) {
            System.out.println(p);
        }
    }
}




