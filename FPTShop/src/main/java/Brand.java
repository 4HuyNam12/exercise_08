import java.util.ArrayList;

public class Brand {
    ProductRepository repo = new ProductRepository();
    ArrayList<Product> listProduct = repo.getData();
    ArrayList<Product> listApple = new ArrayList<>();
    ArrayList<Product> listSamSung = new ArrayList<>();
    ArrayList<Product> listXiaomi = new ArrayList<>();
    ArrayList<Product> listASUS = new ArrayList<>();
    ArrayList<Product> listDELL = new ArrayList<>();
    ArrayList<Product> listOPPO = new ArrayList<>();
    ArrayList<Product> listHuawei = new ArrayList<>();
    public ArrayList<Product> listByApple() {
        for (Product p:listProduct) {
            if (p.getBrand().equals(BrandEnum.APPLE)) {
                listApple.add(p);
            }
        }
        return listApple;
//        repo.printList(listApple);
    }
    public void listBySamSung() {
        for (Product p:listProduct) {
            if (p.getBrand().equals(BrandEnum.SAMSUNG)) {
                listSamSung.add(p);
            }
        }
        repo.printList(listSamSung);
    }
    public void listByXiaomi() {
        for (Product p:listProduct) {
            if (p.getBrand().equals(BrandEnum.XIAOMI)) {
                listXiaomi.add(p);
            }
        }
        repo.printList(listXiaomi);
    }
    public void listByASUS() {
        for (Product p:listProduct) {
            if (p.getBrand().equals(BrandEnum.ASUS)) {
                listASUS.add(p);
            }
        }
        repo.printList(listASUS);
    }
    public void listByDeLL() {
        for (Product p:listProduct) {
            if (p.getBrand().equals(BrandEnum.DELL)) {
                listDELL.add(p);
            }
        }
        repo.printList(listDELL);
    }
    public void listByOPPO() {
        for (Product p:listProduct) {
            if (p.getBrand().equals(BrandEnum.OPPO)) {
                listOPPO.add(p);
            }
        }
        repo.printList(listOPPO);
    }
    public void listByHuawei() {
        for (Product p:listProduct) {
            if (p.getBrand().equals(BrandEnum.HUAWEI)) {
                listHuawei.add(p);
            }
        }
        repo.printList(listHuawei);
    }

}
