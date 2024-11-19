package Polymorphism;

class AeroPlane {
    public void takeOff() {
        System.out.println("AeroPlane is taking off");
    }

    public void fly() {
        System.out.println("AeroPlane is Flying");
    }
}

class CargoPlane extends AeroPlane {
    public void takeOff() {
        System.out.println("CargoPlane requires longer runway");
    }

    public void fly() {
        System.out.println("CargoPlane flies at lower height");
    }
}

class PassengerPlane extends AeroPlane {
    public void takeOff() {
        System.out.println("PassengerPlane requires medium size runway");
    }

    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}

class FighterPlane extends AeroPlane {
    public void takeOff() {
        System.out.println("FighterPlane requires small size runway");
    }

    public void fly() {
        System.out.println("FighterPlane flies at high height");
    }
}

class Airport {
    public void poly(AeroPlane ref) {
        ref.takeOff();
        ref.fly();

        System.out.println("-------------------------------------");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}
