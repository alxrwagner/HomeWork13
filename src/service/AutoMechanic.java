package service;

import enumPackage.TypeTransport;
import transport.Transport;

import java.util.*;

public class AutoMechanic {
    final private String fullName;
    final private String titleCompany;
    private final Set<TypeTransport> typesTransportServed;

    public AutoMechanic(String fullName, String titleCompany, TypeTransport... typesTransportServed) {
        this.fullName = fullName;
        this.titleCompany = titleCompany;
        this.typesTransportServed = new HashSet<>();
        Collections.addAll(this.typesTransportServed, typesTransportServed);
    }

    public List<Set<TypeTransport>> getTypesTransportServed() {
        return Arrays.asList(typesTransportServed);
    }

    public void carryOutMaintenance(Transport... transports) {

        for (Transport car : transports) {
            if (typesTransportServed.contains(car.getTypeTransport())) {
                car.doDiagnosed();
            } else {
                System.out.println("Я не умею диагностировать транспорт типа: " + car.getTypeTransport());
            }
        }
    }

    public  void repearTransport(Transport... transports) {
        for (Transport car : transports) {
            if (typesTransportServed.contains(car.getTypeTransport())) {
                System.out.println(car + " отремонтирован");
            } else {
                System.out.println("Я не умею ремонтировать транспорт типа: " + car.getTypeTransport());
            }
        }
    }

    public String printTypesTransportServed() {
        return typesTransportServed.toString();
    }

    public void addTypeTransportServed(TypeTransport typeTransport) {
        if (typesTransportServed.contains(typeTransport)) {
            System.out.println(fullName + " уже умеет ремонтировать и диагностировать транспорт типа: " + typeTransport);
        } else {
            typesTransportServed.add(typeTransport);
        }
    }

    @Override
    public String toString() {
        return "Ф.И.О.: " + fullName +
                ", Компания: " + titleCompany;
    }
}
