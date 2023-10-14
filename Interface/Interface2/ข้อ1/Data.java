package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
import java.util.Comparator;

public class Data {
    public static double min(Object[] data, Comparable<Object, Double> extractor) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        double min = extractor.extract(data[0]);
        for (int i = 1; i < data.length; i++) {
            double value = extractor.extract(data[i]);
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

}

