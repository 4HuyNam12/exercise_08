import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Locale;

public class ProductRepository {
    ArrayList<Product> listProduct = getData();

    public ArrayList<Product> getData() {
        ArrayList<Product> listProduct = new ArrayList<>();
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("Product.json");
            Type objectype = new TypeToken<ArrayList<Product>>() {
            }.getType();
            listProduct = gson.fromJson(reader, objectype);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public void printList(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public ArrayList<Product> printProductByPrice(long min, long max) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product p : listProduct) {
            if (p.getPrice() >= min && p.getPrice() < max) {
                products.add(p);
            }
        }
        return products;
    }

    public ArrayList<Product> findProDuctByName(String name) {
        ArrayList<Product> listByName = new ArrayList<>();
        for (Product p : listProduct) {
            if (p.getName().toUpperCase(Locale.ROOT).contains(name.toUpperCase(Locale.ROOT))) {
                listByName.add(p);
            }
        }
        return listByName;
    }
}
