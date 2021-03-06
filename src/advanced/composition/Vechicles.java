package advanced.composition;

import advanced.inheritance.Car;
import advanced.inheritance.Plane;

public class Vechicles {

    private Car car;
    private Plane plane;


    public Vechicles(Car car, Plane plane) {
        this.car = car;
        this.plane = plane;
    }

    @Override
    public String toString(){
        return "Vechicles: \n"
                + car.toString()
                + "\n" + plane.toString();
    }
}
