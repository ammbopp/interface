package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Product implements Comparable{
    private String name;
    private double price; // ราคา

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object other) {
        if (other instanceof Product) {
            return Double.compare(this.getPrice(), ((Product) other).getPrice());
        }else {
            throw new IllegalArgumentException("Cannot compare with other types.");
        }
    }

//    @Override
//    public double getMeasure() {
//        return price;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}