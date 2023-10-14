package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Main {
        public static void main(String[] args) {
            Product[] products = new Product[] {
                    new Product("Product A", 100),
                    new Product("Product B", 50),
                    new Product("Product C", 200)
            };

            Car[] cars = new Car[] {
                    new Car("Car X", 50000),
                    new Car("Car Y", 30000),
                    new Car("Car Z", 70000)
            };

            double product = Data.min(products, new ProductComparator());
            double car = Data.min(cars, new CarComparator());

            System.out.println("Min Product: " + product);
            System.out.println("Min Car: " + car);
        }


}
