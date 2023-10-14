package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Main {

    public static void main(String[] args) {
        Product[] products = {
                new Product("Product1", 100),
                new Product("Product2", 50),
                new Product("Product3", 200)
        };

        Car[] cars = {
                new Car("Car1", 500),
                new Car("Car2", 300),
                new Car("Car3", 700)
        };

        System.out.println("Products (Before Sorting):");
        printArray(products);

        Data.sort(products);
        System.out.println("\nProducts (After Sorting):");
        printArray(products);

        System.out.println("\nCars (Before Sorting):");
        printArray(cars);

        Data.sort(cars);
        System.out.println("\nCars (After Sorting):");
        printArray(cars);
    }

    public static void printArray(Object[] arr) {
        for (Object obj : arr) {
            System.out.println(obj.toString());
        }
    }
}
