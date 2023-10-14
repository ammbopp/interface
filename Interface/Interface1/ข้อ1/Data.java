package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์

public class Data {
    public static double min(Measurable[] items) {
        double min = Double.MAX_VALUE;
        for (Measurable item : items) {
            double value = item.getMeasure();
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}

