package Interface;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Main {
        public static void main(String[] args) {
            Product[] products = new Product[] {
                    new Product("Product N", 100),
                    new Product("Product T", 70),
                    new Product("Product C", 200)
            };

            Car[] cars = new Car[] {
                    new Car("Car N", 20),
                    new Car("Car C", 10),
                    new Car("Car T", 70)
            };

            System.out.println("Sort Product by Name:");
            Data.sort(products, new ProductNameComparator());
            for (Product product : products) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }

            System.out.println("\nSort Product by Price:");
            Data.sort(products, new ProductPriceComparator());
            for (Product product : products) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }

            System.out.println("\nSort Car by License:");
            Data.sort(cars, new CarLicenseComparator());
            for (Car car : cars) {
                System.out.println(car.getLicense() + ": " + car.getKiloDriven());
            }

            System.out.println("\nSortCars by Kilo:");
            Data.sort(cars, new CarKiloComparator());
            for (Car car : cars) {
                System.out.println(car.getLicense() + ": " + car.getKiloDriven());
            }
        }


}
