package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class ProductComparator implements Comparable<Object, Double> {
    @Override
    public Double extract(Object item) {
        if (item instanceof Product) {
            return ((Product) item).getPrice();
        } else {
            throw new IllegalArgumentException("Item is not a Product");
        }
    }
}
