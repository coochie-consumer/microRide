public class Rider {
    int riderId;
    String name;
    String sex;
    boolean isSearching = false;

    Rider(int riderId,String name,String sex, boolean isSearching){
        this.riderId = riderId;
        this.name = name;
        this.sex = sex;
        this.isSearching = isSearching;

    }

    void findRide(){
        System.out.printf("Rider %d is searching for a ride %n",riderId);
        isSearching = true;
    }
    boolean isFind(){

        return isSearching;

     }
}
