package Interface;
import java.util.Comparator;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class ProductPriceComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
