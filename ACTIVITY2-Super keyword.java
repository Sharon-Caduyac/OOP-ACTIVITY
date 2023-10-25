class Mini Bus {
    private String make;
    private int year;

    public Mini Bus(String make, int year) {
        this.make = make;
        this.year = year;
        System.out.println("Mini Bus constructor called.");
    }

    public void start() {
        System.out.println("Mini Bus is starting.");
    }

    public void stop() {
        System.out.println("Mini Bus is stopping.");
    }
}

class Bus extends Mini Bus {
    private int numberOfDoors;

    public Bus(String make, int year, int numberOfDoors) {
        super(make, year);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Bus constructor called.");
    }

    @Override
    public void start() {
        super.start(); // Call the base class method using super
        System.out.println("Bus is starting.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bus myBus = new Bus("LCI", 2022, 4);
        myBUS.start();
        myBUS.stop();
    }
}
