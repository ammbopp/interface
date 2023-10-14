package Interface;
import java.util.Comparator;
public class CarKiloComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return Double.compare(c1.getKiloDriven(), c2.getKiloDriven());
    }
}
// 6510451123 อาณัฏฐชา กรรภิรมย์