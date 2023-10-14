package Interface;
import java.util.Comparator;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
