import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ProductRepository {
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

    public void findProductByPrice(ArrayList<Product> list) {
        for (Product p : list) {
            if (p.getPrice() >= 1000000)
                System.out.println(p);
        }
    }
    public void sortByQuantitySold(ArrayList<Product> list){
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getQuantitySold() - o2.getQuantitySold());
            }
        });
        printList(list);
    }

    public void findBestQuantitySold(ArrayList<Product> list) {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getQuantitySold() - o2.getQuantitySold());
            }
    });
        System.out.println(list.get(list.size()-1));

    }
}