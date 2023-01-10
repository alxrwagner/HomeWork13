import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import enumPackage.BodyType;
import enumPackage.DriverLicenseType;
import enumPackage.PassengerCapacityType;
import enumPackage.TypeTransport;
import service.AutoMechanic;
import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Transport> cars = new ArrayList<>();
    public static  List<AutoMechanic> mechanics = new ArrayList<>();

    public static void main(String[] args) {

        DriverB driverB = new DriverB("Покемон Покемонович");
        DriverC driverC = new DriverC("Кто-то Какой-тович");
        DriverD driverD = new DriverD("Водитель Водятелович");

        Track volvoTrack = new Track("Volvo", "T1", 6f, driverC, DriverLicenseType.C, TypeTransport.TRACK);

        PassengerCar volvoPassenger = new PassengerCar("Volvo", "p1", 2f, driverB, DriverLicenseType.B, TypeTransport.PASSENGER_CAR);

        Bus volvoBus = new Bus("Volvo", "B1", 10f, driverD, DriverLicenseType.D, TypeTransport.BUS);

        AutoMechanic autoMechanic1 = new AutoMechanic("Михаил В.Н.", "Service Car", TypeTransport.BUS);
        AutoMechanic autoMechanic2 = new AutoMechanic("Евгений Б.Г.", "Service Car", TypeTransport.BUS, TypeTransport.TRACK);
        AutoMechanic autoMechanic3 = new AutoMechanic("Елена А.Н.", "Service Car", TypeTransport.BUS, TypeTransport.PASSENGER_CAR, TypeTransport.TRACK);

        cars.add(volvoTrack);
        cars.add(volvoPassenger);
        cars.add(volvoBus);

        mechanics.add(autoMechanic1);
        mechanics.add(autoMechanic2);
        mechanics.add(autoMechanic3);

        autoMechanic1.addTypeTransportServed(TypeTransport.PASSENGER_CAR);

        volvoPassenger.setBodyType(BodyType.CROSSOVER);
        volvoBus.setPassengerCapacityType(PassengerCapacityType.ESPECIALLY_LARGE);

        mechanics.forEach(mechanic -> {
            System.out.println(mechanic);
            mechanic.carryOutMaintenance(volvoTrack, volvoPassenger);
            System.out.println();
        });
        mechanics.forEach(mechanic -> {
            System.out.println(mechanic);
            mechanic.repearTransport(volvoPassenger, volvoBus);
            System.out.println();
        });
//
//        System.out.println(volvoTrack);
//        System.out.println(volvoPassenger);
//        System.out.println(volvoBus);
//
//        printMessage(volvoTrack);
//        printMessage(volvoPassenger);
//        printMessage(volvoBus);
//
//        System.out.println();
//
//        volvoBus.getType();
//        volvoPassenger.getType();
//        volvoTrack.getType();
//
//        volvoBus.doDiagnosed();
//        volvoPassenger.doDiagnosed();
//        volvoTrack.doDiagnosed();
//
//        volvoBus.printInfoDriverLicense();
//        volvoPassenger.printInfoDriverLicense();
//        volvoTrack.printInfoDriverLicense();
    }

    public static void printMessage(Transport transport){
        System.out.println(transport.getDriver() + " управляет автомобилем " + transport +
                " и будет участвовать в заезде");
    }
}