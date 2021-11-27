import java.util.ArrayList;
import java.util.HashMap;

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

    public void mapCategory() {
        HashMap<CategoryEnum, Integer> mapByCategory = new HashMap<>();
        mapByCategory.put(CategoryEnum.APPLE, listByCategory(CategoryEnum.APPLE).size());
        listByCategory.clear();
        mapByCategory.put(CategoryEnum.LAPTOP, listByCategory(CategoryEnum.LAPTOP).size());
        listByCategory.clear();
        mapByCategory.put(CategoryEnum.ĐIỆN_THOẠI, listByCategory(CategoryEnum.ĐIỆN_THOẠI).size());
        listByCategory.clear();
        mapByCategory.put(CategoryEnum.PHỤ_KIỆN, listByCategory(CategoryEnum.PHỤ_KIỆN).size());
        mapByCategory.forEach((key, value) -> System.out.println("Danh mục :" + key + " có " + value + " sản phẩm"));

    }

}

