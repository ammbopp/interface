package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Car {
    private String license;
    private double kiloDriven; // ระยะทางการขับ
    public String getLicense() {
        return license;
    }
    public double getKiloDriven() {
        return kiloDriven;
    }

    public Car(String license, double kiloDriven) {
        this.license = license;
        this.kiloDriven = kiloDriven;
    }

    @Override
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", kiloDriven=" + kiloDriven +
                '}';
    }
}