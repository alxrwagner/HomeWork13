package transport;

import driver.DriverCar;


public abstract class Transport<T extends DriverCar> {

    protected final String brand;
    protected final String model;
    protected final T driver;
    protected final float volumeEngine;

    public Transport(String brand, String model, float volumeEngine, T driver) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
        this.driver = driver;
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
}
