import java.text.DecimalFormat;

public class Product {
    int id;
    String name;
    String description;
    long price;
    int quantity;
    int quantitySold;
    BrandEnum brand;
    CategoryEnum category;

    public Product() {
    }

    public Product(int id, String name, String description, long price, int quantity, int quantitySold, BrandEnum brand, CategoryEnum category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.quantitySold = quantitySold;
        this.brand = brand;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public BrandEnum getBrand() {
        return brand;
    }

    public void setBrand(BrandEnum brand) {
        this.brand = brand;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public String formatMoney(long money) {
        DecimalFormat myformat = new DecimalFormat("###,###,###");
        return myformat.format(money);
    }


    @Override
    public String toString() {
        return id + " - " + name + " - " + description + " - " + formatMoney(price) + " - " + quantity + " - " + quantitySold + " - " + brand + " - " + category;
    }
}
