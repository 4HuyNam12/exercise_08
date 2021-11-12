import java.text.DecimalFormat;
public class Product {


    private int id;
    private String name;
    private long price;
    private CategoryEnum category;
    private long quantity;
    private long quantitySold;

    public Product(){}
    public Product(int id, String name, long price, CategoryEnum category, long quantity, long quantitySold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.quantitySold = quantitySold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(long quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + formatMoney(price) + " - " + category + " - " + quantity + " - " + quantitySold;
    }

    public String formatMoney(long price) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(price);
    }

}
