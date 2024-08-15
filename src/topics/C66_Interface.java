package topics;

import another_package.Sedan;
import another_package.TeslaModelS;

public class C66_Interface {

    public static void main(String[] args) {

        Sedan sedan = new Sedan();
        sedan.drive();
        sedan.stop();

        TeslaModelS teslaModelS = new TeslaModelS();
        teslaModelS.drive();
        teslaModelS.stop();
        teslaModelS.chargeBattery();
        teslaModelS.displayBatteryStatus();




    }
}
