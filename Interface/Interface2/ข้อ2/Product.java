package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Product {
    private String name;
    private double price; // ราคา
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}