import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ProductRepository {
        public ArrayList<Product> getData() {
            ArrayList<Product> listProduct = new ArrayList<>();
            try {
                Gson gson = new Gson();
                FileReader reader = new FileReader("Product.json");
                Type objectype = new TypeToken<ArrayList<Product>>(){}.getType();
                listProduct =gson.fromJson(reader,objectype);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return listProduct;
        }

    public void printList(ArrayList<Product> list) {
        for (Product p:list) {
            System.out.println(p);
        }
    }
}
