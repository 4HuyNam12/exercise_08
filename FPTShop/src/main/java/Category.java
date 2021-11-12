import java.util.ArrayList;

public class Category {
    ProductRepository repo = new ProductRepository();
    ArrayList<Product> listProduct = repo.getData();
    ArrayList<Product> listByCategory = new ArrayList<>();
    public ArrayList<Product> listByCategory(CategoryEnum category) {
        for (Product p : listProduct) {
            if (p.getCategory().equals(category)) {
                listByCategory.add(p);
            }
        }
        return listByCategory;
    }
}