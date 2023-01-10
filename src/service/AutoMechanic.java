package service;

import enumPackage.TypeTransport;
import transport.Transport;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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

    public <T extends Transport> void carryOutMaintenance(T...transports){
        for (T car : transports) {
            if (typesTransportServed.contains(car.getTypeTransport())){
                car.doDiagnosed();
            }else {
                System.out.println("Я не умею диагностировать транспорт типа: " + car.getTypeTransport());
            }
        }
    }

    public <T extends Transport> void repearTransport(T... transports){
        for (T car : transports) {
            if (typesTransportServed.contains(car.getTypeTransport())){
                System.out.println(car + " отремонтирован");
            }else {
                System.out.println("Я не умею диагностировать транспорт типа: " + car.getTypeTransport());
            }
        }
    }

    public String printTypesTransportServed() {
        return typesTransportServed.toString();
    }

    public void addTypeTransportServed(TypeTransport typeTransport){
        if (typesTransportServed.contains(typeTransport)){
            System.out.println(fullName + " уже умеет ремонтировать и диагностировать транспорт типа: " + typeTransport);
        }
        else {
            typesTransportServed.add(typeTransport);
        }
    }

    @Override
    public String toString() {
        return "Ф.И.О.: " + fullName +
                ", Компания: " + titleCompany;
    }
}
