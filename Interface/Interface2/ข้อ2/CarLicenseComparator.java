package Interface;
import java.util.Comparator;
public class CarLicenseComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getLicense().compareTo(c2.getLicense());
    }
}
// 6510451123 อาณัฏฐชา กรรภิรมย์