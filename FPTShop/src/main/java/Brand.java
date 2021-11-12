import java.util.ArrayList;

public class Brand {
    ProductRepository repo = new ProductRepository();
    ArrayList<Product> listProduct = repo.getData();
    ArrayList<Product> listByBrand =new ArrayList<>();
    public ArrayList<Product> listByBrand(BrandEnum brand){
        for (Product p: listProduct) {
            if (p.getBrand().equals(brand)) {
                listByBrand.add(p);
            }
        }
        return listByBrand;
    }
}
