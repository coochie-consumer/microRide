public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Camry",4,true,2015);
        Driver driver1 = new Driver(12,"Agyekum",true,"Male",car1);

        Rider rider1 = new Rider(11,"kunle", "Male",false);



        rider1.findRide();
        System.out.println(rider1.isFind());

        driver1.becomeActive();
        System.out.println(driver1.isActive());
        driver1.becomeInactive();
        System.out.println(driver1.isActive());





    }

}