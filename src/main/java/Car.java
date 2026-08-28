 public class Car{
        int CarId;
        int year;
        String make;
        String model;
        int seatNumber;
        boolean isAC;




        //         constructors
        Car(String make,String model,int seatNumber,boolean isAC,int year){
//            CarId = 0;
            this.year = year;
            this.make = make;
            this.model = model;
            this.seatNumber = seatNumber;
            this.isAC = isAC;
        }

        void carInfo(){
            System.out.println(this.year + " " + this.make + " " + this.model );
        }
    }

