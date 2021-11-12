import java.util.ArrayList;

public class Category {
    ProductRepository repo = new ProductRepository();
    ArrayList<Product> listProduct = repo.getData();
    ArrayList<Product> listPhone = new ArrayList<>();
    ArrayList<Product> listApple = new ArrayList<>();
    ArrayList<Product> listLapTop = new ArrayList<>();
    ArrayList<Product> listAccessory = new ArrayList<>();
    ArrayList<Product> listByName = new ArrayList<>();

    public ArrayList<Product> listByPhone() {
        for (Product p : listProduct) {
            if (p.getCategory().equals(CategoryEnum.ĐIỆN_THOẠI)) {
                listPhone.add(p);
            }
        }
        return listPhone;

    }

    public ArrayList<Product> listByApple() {
        for (Product p : listProduct) {
            if (p.getCategory().equals(CategoryEnum.APPLE)) {
                listApple.add(p);
            }
        }
        return listApple;
    }

    public ArrayList<Product> listByLapTop() {
        for (Product p : listProduct) {
            if (p.getCategory().equals(CategoryEnum.LAPTOP)) {
                listLapTop.add(p);
            }
        }
       return listLapTop;
    }

    public ArrayList<Product> listByAccessory() {
        for (Product p : listProduct) {
            if (p.getCategory().equals(CategoryEnum.PHỤ_KIỆN)) {
                listAccessory.add(p);
            }
        }
        return listAccessory;
    }

    public boolean findProDuctByName(String name) {
        for (Product p : listProduct) {
            if (p.getName().equalsIgnoreCase(name)) {
                listByName.add(p);
                return true;
            }
        }
        return false;
    }
}
