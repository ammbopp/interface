package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์

public class Product implements Measurable{
    private String name;
    private double price; // ราคา
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public double getMeasure() {
        return price;
    }
}