package service;

import enumPackage.TypeTransport;
import transport.Transport;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AutoMechanic {
    final private String fullName;
    final private String titleCompany;
    final private Set<TypeTransport> typesTransportServed;

    public AutoMechanic(String fullName, String titleCompany, TypeTransport typesTransportServed) {
        this.fullName = fullName;
        this.titleCompany = titleCompany;
        this.typesTransportServed = new HashSet<>();
        this.typesTransportServed.add(typesTransportServed);
    }

    public AutoMechanic(String fullName, String titleCompany, TypeTransport typesTransportServed, TypeTransport typesTransportServed2) {
        this.fullName = fullName;
        this.titleCompany = titleCompany;
        this.typesTransportServed = new HashSet<>();
        this.typesTransportServed.add(typesTransportServed);
        this.typesTransportServed.add(typesTransportServed2);
    }

    public AutoMechanic(String fullName, String titleCompany, TypeTransport typesTransportServed, TypeTransport typesTransportServed2, TypeTransport typesTransportServed3) {
        this.fullName = fullName;
        this.titleCompany = titleCompany;
        this.typesTransportServed = new HashSet<>();
        this.typesTransportServed.add(typesTransportServed);
        this.typesTransportServed.add(typesTransportServed2);
        this.typesTransportServed.add(typesTransportServed3);
    }

    public <T extends Transport> void carryOutMaintenance(List<T> transports){

        for (T car : transports) {
            if (typesTransportServed.contains(car.getTypeTransport())){
                car.doDiagnosed();
            }else {
                System.out.println("Я не умею диагностировать транспорт типа: " + car.getTypeTransport());
            }
        }
    }

    public <T extends Transport> void repearTransport(List<T> transports){
        for (T car : transports) {
            if (typesTransportServed.contains(car.getTypeTransport())){
                System.out.println(car + " отремонтирован");
            }else {
                System.out.println("Я не умею диагностировать транспорт типа: " + car.getTypeTransport());
            }
        }
    }

    @Override
    public String toString() {
        return "Ф.И.О.: " + fullName +
                ", Компания: " + titleCompany;
    }
}
