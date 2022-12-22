import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.PassengerCar;
import transport.Track;
import transport.Transport;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Покемон Покемонович");
        DriverC driverC = new DriverC("Кто-то Какой-тович");
        DriverD driverD = new DriverD("Водитель Водятелович");
        Track volvoTrack = new Track("Volvo", "T1", 6f, driverC);
        Track opelTrack = new Track("Opel", "T2", 3f, driverC);
        Track audiTrack = new Track("Audi", "T3", 7f, driverC);
        Track toyotaTrack = new Track("Toyota", "T4", 5f, driverC);

        PassengerCar volvoPassenger = new PassengerCar("Volvo", "p1", 2f, driverB);
        PassengerCar opelPassenger = new PassengerCar("Opel", "p2", 1.5f, driverB);
        PassengerCar audiPassenger = new PassengerCar("Audi", "p3", 3f, driverB);
        PassengerCar toyotaPassenger = new PassengerCar("Toyota", "p4", 2.5f, driverB);

        Bus volvoBus = new Bus("Volvo", "B1", 10f, driverD);
        Bus opelBus = new Bus("Opel", "B2", 12, driverD);
        Bus audiBus = new Bus("Audi", "B3", 9, driverD);
        Bus toyotaoBus = new Bus("Toyota", "B4", 11, driverD);

        System.out.println(volvoTrack);
        System.out.println(volvoPassenger);
        System.out.println(volvoBus);

        printMessage(volvoTrack);
        printMessage(volvoPassenger);
        printMessage(volvoBus);

    }

    public static void printMessage(Transport transport){
        System.out.println(transport.getDriver() + " управляет автомобилем " + transport +
                " и будет участвовать в заезде");
    }
}