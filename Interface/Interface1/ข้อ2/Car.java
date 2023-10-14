package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Car implements Comparable{
    private String license;
    private double kiloDriven; // ระยะทางการขับ

    public Car(String license, double kiloDriven) {
        this.license = license;
        this.kiloDriven = kiloDriven;
    }

    public String getLicense() {
        return license;
    }
    public double getKiloDriven() {
        return kiloDriven;
    }

    @Override
    public int compareTo(Object other) {
        if (other instanceof Car) {
            return Double.compare(this.getKiloDriven(), ((Car) other).getKiloDriven());
        } else {
            throw new IllegalArgumentException("Cannot compare with other types.");
        }
    }

//    @Override
//    public double getMeasure() {
//        return kiloDriven;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", kiloDriven=" + kiloDriven +
                '}';
    }
}