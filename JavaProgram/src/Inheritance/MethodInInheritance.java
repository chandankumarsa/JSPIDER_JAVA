package Inheritance;

class AeroPlane {
    public void takeOff() {
        System.out.println("AeroPlane is taking off");
    }

    public void fly() {
        System.out.println("AeroPlane is flying");
    }
}

class CargoPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("CargoPlane flies at a lower height");
    }

    // Specialized method unique to CargoPlane
    public void carryGoods() {
        System.out.println("CargoPlane carries goods");
    }
}

class PassengerPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("PassengerPlane flies at a medium height");
    }

    // Specialized method unique to PassengerPlane
    public void carryPassenger() {
        System.out.println("PassengerPlane carries passengers");
    }
}

public class MethodInInheritance {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();         // Inherited from AeroPlane
        cp.fly();             // Overridden in CargoPlane
        cp.carryGoods();      // Specialized method in CargoPlane

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();         // Inherited from AeroPlane
        pp.fly();             // Overridden in PassengerPlane
        pp.carryPassenger();  // Specialized method in PassengerPlane
    }
}

