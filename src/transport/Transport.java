package transport;

import enumPackage.TypeTransport;
import exeption.NotFoundTypeOfDriverLicenseExeption;
import driver.DriverCar;
import enumPackage.DriverLicenseType;

import java.util.Objects;


public abstract class Transport<T extends DriverCar> {

    protected final String brand;
    protected final String model;
    protected final T driver;
    protected final float volumeEngine;
    protected final DriverLicenseType requiredTypeDriverLicense;
    protected TypeTransport typeTransport;

    public Transport(String brand, String model, float volumeEngine, T driver, DriverLicenseType requiredTypeDriverLicense, TypeTransport typeTransport) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
        this.driver = driver;
        this.requiredTypeDriverLicense = requiredTypeDriverLicense;
        this.typeTransport = typeTransport;
    }

    public void startMove() {
        System.out.printf("%S %S начал движение%n", this.brand, this.model);
    }

    public void endMove() {
        System.out.printf("%S %S начал закончил%n", this.brand, this.model);
    }

    public String getBrand() {
        return brand;
    }

    public T getDriver() {
        return driver;
    }

    private void checkDriverLicense() throws NotFoundTypeOfDriverLicenseExeption {

        if (driver.getTypeOfDriverLicense() == null || driver.getTypeOfDriverLicense() != requiredTypeDriverLicense) {
            throw new NotFoundTypeOfDriverLicenseExeption("Лицензия отсутствует или не соответствует ожидаемой: " + requiredTypeDriverLicense.name());
        }
    }

    public void printInfoDriverLicense(){
        try {
            checkDriverLicense();
        } catch (NotFoundTypeOfDriverLicenseExeption e) {
            System.out.println(e.getMessage());
        }
        System.out.println(
                driver.getTypeOfDriverLicense() == null ? "Категория прав неизвестна" : "Категория прав: " + driver.getTypeOfDriverLicense()
        );
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public abstract void getType();

    public abstract void doDiagnosed();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Float.compare(transport.volumeEngine, volumeEngine) == 0 && Objects.equals(getBrand(), transport.getBrand()) && Objects.equals(model, transport.model) && Objects.equals(getDriver(), transport.getDriver()) && requiredTypeDriverLicense == transport.requiredTypeDriverLicense && getTypeTransport() == transport.getTypeTransport();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), model, getDriver(), volumeEngine, requiredTypeDriverLicense, getTypeTransport());
    }
}
