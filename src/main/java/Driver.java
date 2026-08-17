public class Driver {

    static int nextid = 1000;


    private int driverId;
    private String name;
    private boolean active;
    private String sex;
    private Car car;
    private double rating;

    Driver(String name,boolean active,String sex,Car car,double rating){
        this.driverId = nextid++;


        this.name = name;
        this.active = active;
        this.sex = sex;
        this.car = car;
        this.rating = rating;
    }
//nested car class


     void becomeActive(){
         System.out.println("Driver is now active");
        active = true;
     }

    void becomeInactive(){
        System.out.println("Driver is now inactive");
        active = false;
    }

     boolean isActive(){
        return active;
     }

     void vehicleInfo(){
         car.carInfo();
     }

     void driverInfo(){
         System.out.println(name);
         System.out.println(driverId);
         System.out.println(car);
     }



}
