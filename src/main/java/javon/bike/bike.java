package javon.bike;

public interface bike {
}

public class Bike implements bike {

    int tires = 0;
    int speed = 0;
    int gear = 1;

    void setTires(int newValue) {
        tires = newValue;
    }

    void Gear(int newValue) {
        gear = newValue;
    }

    void speed(int increment) {
        speed = speed + increment;
    }

    void Brakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                tires + " speed:" +)
    }
}