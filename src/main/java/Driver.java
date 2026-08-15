public class Driver {
   private int id;
    private String name;
    private boolean active;
    private String sex;
    private Car car;

    Driver(int id,String name,boolean active,String sex,Car car){
        this.id = id;
        this.name = name;
        this.active = active;
        this.sex = sex;
        this.car = car;
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

     void vehicleInfo(Car car){
         System.out.println(car.carInfo());
     }



}
