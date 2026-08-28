import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 4, true, 2018);
        Car car2 = new Car("Honda", "Civic", 4, true, 2020);
        Car car3 = new Car("Hyundai", "Elantra", 4, true, 2019);
        Car car4 = new Car("Kia", "Cerato", 4, true, 2021);
        Car car5 = new Car("Nissan", "Sentra", 4, true, 2017);
        Car car6 = new Car("Toyota", "Camry", 4, true, 2022);
        Car car7 = new Car("Honda", "Accord", 4, true, 2018);
        Car car8 = new Car("Mazda", "3", 4, true, 2020);
        Car car9 = new Car("Kia", "Rio", 4, true, 2019);
        Car car10 = new Car("Hyundai", "Sonata", 4, true, 2021);
        ArrayList<Car> cars = new ArrayList<>(List.of(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10));

        Driver driver1 = new Driver("Agyekum", true, "Male", car1, 4.8);
        Driver driver2 = new Driver("Adoma", false, "Female", car2, 4.6);
        Driver driver3 = new Driver("Nyamekye", true, "Male", car3, 4.9);
        Driver driver4 = new Driver("ebunrere", true, "Female", car4, 4.7);
        Driver driver5 = new Driver("chinedu", false, "Male", car5, 4.5);
        Driver driver6 = new Driver("Abena", true, "Female", car6, 4.9);
        Driver driver7 = new Driver("Duffour", true, "Male", car7, 4.4);
        Driver driver8 = new Driver("Twuiwaa", false, "Female", car8, 4.8);
        Driver driver9 = new Driver("Gbadebo", true, "Male", car9, 4.6);
        Driver driver10 = new Driver("kukua", true, "Female", car10, 5.0);
        ArrayList<Driver> drivers = new ArrayList<>(List.of(driver1, driver2, driver3, driver4, driver5, driver6, driver7, driver8, driver9, driver10));


        Rider rider1 = new Rider(11,"kunle", "Male",false,"osu","legon");


        driver1.CreateNewDriver();
        driver1.driverInfo();





    }

}