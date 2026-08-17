public class Ride {
    private int rideid;
    Rider rider;
    Driver driver;
    String pickup;
    String dropoff;
    int distance;
    String price ;

    Ride(Rider rider, int distance,String price){
       this.rider = rider;
       this.driver = driver;

       this.pickup = rider.getCurrentLocation();
       this.dropoff = rider.getDestination();
       this.distance = distance;
       this.price = price;
    }

}
