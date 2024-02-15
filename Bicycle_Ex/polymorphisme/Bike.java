package Bicycle_Ex.polymorphisme;

public class Bike {
    int cadence = 0;
    int speed= 0;
    int gear= 1 ;

    public Bike(int startCadence, int startSpeed, int startGear) {
        //TODO Auto-generated constructor stub
    }

    void changeCdence (int newValue){
        cadence=newValue;
    }

    void changeGear (int newValue){
        gear=newValue;
    }

    void speedUp (int increment){
        speed=speed - increment;
    }

    void applyBreaks (int decrement){
        speed=speed - decrement;
    }

    void printStates (){
        System.out.println("cadence:" + cadence + "speed: "+ speed+ "gear: "+ gear);

    }

    public void printDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printDescription'");
    }

}
