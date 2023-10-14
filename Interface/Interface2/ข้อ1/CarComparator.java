package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class CarComparator implements Comparable<Object, Double>{
    @Override
    public Double extract(Object item) {
        if (item instanceof Car) {
            return ((Car) item).getKiloDriven();
        } else {
            throw new IllegalArgumentException("not a Car");
        }
    }
}
