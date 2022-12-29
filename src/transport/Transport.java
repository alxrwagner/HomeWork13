package transport;

import Exeption.NotFoundTypeOfDriverLicenseExeption;
import driver.DriverCar;
import driver.DriverLicenseType;


public abstract class Transport<T extends DriverCar> {

    protected final String brand;
    protected final String model;
    protected final T driver;
    protected final float volumeEngine;
    protected final DriverLicenseType requiredTypeDriverLicense;

    public Transport(String brand, String model, float volumeEngine, T driver, DriverLicenseType requiredTypeDriverLicense) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
        this.driver = driver;
        this.requiredTypeDriverLicense = requiredTypeDriverLicense;
    }

    public void startMove(){
        System.out.printf("%S %S начал движение%n", this.brand, this.model);
    }

    public void endMove(){
        System.out.printf("%S %S начал закончил%n", this.brand, this.model);
    }

    public String getBrand() {
        return brand;
    }

    public T getDriver() {
        return driver;
    }

    public void checkDriverLicense(){

        try {
            if (driver.getTypeOfDriverLicense() == null || driver.getTypeOfDriverLicense() != requiredTypeDriverLicense){
                throw new NotFoundTypeOfDriverLicenseExeption("Лицензия отсутствует или не соответствует ожидаемой: " + requiredTypeDriverLicense.name());
            }
        } catch (NotFoundTypeOfDriverLicenseExeption e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println(
                    driver.getTypeOfDriverLicense() == null ? "Категория прав неизвестна" : "Категория прав: " + driver.getTypeOfDriverLicense()
            );
        }
    }

    public abstract void getType();

    public abstract void doDiagnosed();
}
