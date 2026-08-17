public class Rider {
    private int riderId;
    private String name;
    private String sex;
    private boolean isSearching = false;

    private String currentLocation;
    public String getCurrentLocation(){
            return this.currentLocation;}


    private String destination;
    public String getDestination(){
        return this.destination;
    }



    Rider(int riderId,String name,String sex, boolean isSearching,
          String currentLocation, String destination){
        this.riderId = riderId;
        this.name = name;
        this.sex = sex;
        this.isSearching = isSearching;
        this.currentLocation = currentLocation;
        this.destination = destination;


    }

    void findRide(){
        System.out.printf("Rider %d is searching for a ride %n",riderId);
        System.out.println("we are finding you a driver");
        isSearching = true;

    }
    boolean isFind(){

        return isSearching;

    }


}
