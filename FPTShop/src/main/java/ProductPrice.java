import java.util.ArrayList;

public class ProductPrice {
    ProductRepository repo = new ProductRepository();
    ArrayList<Product> listProduct = repo.getData();
    ArrayList<Product> priceBelow2M = new ArrayList<>();
    ArrayList<Product> priceFrom2to4M = new ArrayList<>();
    ArrayList<Product> priceFrom4to7M = new ArrayList<>();
    ArrayList<Product> priceFrom7to13M = new ArrayList<>();
    ArrayList<Product> priceUp13M = new ArrayList<>();

    public ArrayList<Product> printPriceBelow2M() {
        for (Product p : listProduct) {
            if (p.getPrice() < 2000000) {
                priceBelow2M.add(p);
            }

        }
        return priceBelow2M;
    }

    public ArrayList<Product> printPriceFrom2to4M() {
        for (Product p : listProduct) {
            if (p.getPrice() >= 2000000 && p.getPrice() < 4000000) {
                priceFrom2to4M.add(p);
            }
        }
        return priceFrom2to4M;
    }

    public ArrayList<Product> printPriceFrom4to7M() {
        for (Product p : listProduct) {
            if (p.getPrice() >= 4000000 && p.getPrice() < 7000000) {
                priceFrom4to7M.add(p);
            }

        }
        return priceFrom4to7M;
    }

    public ArrayList<Product> printPriceFrom7to13m() {
        for (Product p : listProduct) {
            if (p.getPrice() >= 7000000 && p.getPrice() < 13000000) {
                priceFrom7to13M.add(p);
            }

        }
        return priceFrom7to13M;
    }

    public ArrayList<Product> printPriceUp13M() {
        for (Product p : listProduct) {
            if (p.getPrice() > 13000000) {
                priceUp13M.add(p);
            }

        }
        return priceUp13M;
    }
}
