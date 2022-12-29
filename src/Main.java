import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import driver.DriverLicenseType;
import transport.*;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Покемон Покемонович");
        DriverC driverC = new DriverC("Кто-то Какой-тович");
        DriverD driverD = new DriverD("Водитель Водятелович");

        Track volvoTrack = new Track("Volvo", "T1", 6f, driverC, DriverLicenseType.C);

        PassengerCar volvoPassenger = new PassengerCar("Volvo", "p1", 2f, driverB, DriverLicenseType.B);

        Bus volvoBus = new Bus("Volvo", "B1", 10f, driverD, DriverLicenseType.D);

        volvoPassenger.setBodyType(BodyType.CROSSOVER);
        volvoBus.setPassengerCapacityType(PassengerCapacityType.ESPECIALLY_LARGE);

        System.out.println(volvoTrack);
        System.out.println(volvoPassenger);
        System.out.println(volvoBus);

        printMessage(volvoTrack);
        printMessage(volvoPassenger);
        printMessage(volvoBus);

        System.out.println();

        volvoBus.getType();
        volvoPassenger.getType();
        volvoTrack.getType();

        volvoBus.doDiagnosed();
        volvoPassenger.doDiagnosed();
        volvoTrack.doDiagnosed();

        volvoBus.checkDriverLicense();
        volvoPassenger.checkDriverLicense();
        volvoTrack.checkDriverLicense();

    }

    public static void printMessage(Transport transport){
        System.out.println(transport.getDriver() + " управляет автомобилем " + transport +
                " и будет участвовать в заезде");
    }
}