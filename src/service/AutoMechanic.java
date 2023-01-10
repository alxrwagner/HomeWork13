package service;

import enumPackage.TypeTransport;
import transport.Transport;

import java.util.List;

public class AutoMechanic {
    final private String fullName;
    final private String titleCompany;
    final private List<TypeTransport> typesTransportServed;

    public AutoMechanic(String fullName, String titleCompany, List<TypeTransport> typesTransportServed) {
        this.fullName = fullName;
        this.titleCompany = titleCompany;
        this.typesTransportServed = typesTransportServed;
    }

    public <T extends Transport> void carryOutMaintenance(T transport){

    }
}
