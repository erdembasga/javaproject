package another_package;

public class TeslaModelS implements Car, ElectricVehicle{

    public void drive() {
        System.out.println("Driving Tesla");
    }

    public void stop() {
        System.out.println("Tesla has stopped");
    }

    public void chargeBattery() {
        System.out.println("Tesla is charging the battery");
    }

    public void displayBatteryStatus() {
        System.out.println("Battery Status is: %90");
    }
}
