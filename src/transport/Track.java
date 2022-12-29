package transport;

import driver.DriverC;
import driver.DriverLicenseType;

public class Track extends Transport<DriverC> implements ICompeting {

    private LoadCapacityType loadCapacityType;

    public Track(String brand, String model, float volumeEngine, DriverC driver, DriverLicenseType requiredTypeDriverLicense) {
        super(brand, model, volumeEngine, driver, requiredTypeDriverLicense);
    }

    @Override
    public void getType() {
        if (loadCapacityType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println(loadCapacityType);
        }
    }

    @Override
    public void doDiagnosed() {
        System.out.println(this + " диагностику прошел");
    }

    @Override
    public void pitStop() {
        System.out.println("Я знаю что такое пит-стоп, но не скажу");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Мое лучшее время круга лучше всех!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Я быстрее вон тех двоих");
    }

    public LoadCapacityType getLoadCapacityType() {
        return loadCapacityType;
    }

    public void setLoadCapacityType(LoadCapacityType loadCapacityType) {
        this.loadCapacityType = loadCapacityType;
    }

    @Override
    public String toString() {
        return "Я - грузовой автомобиль, мой бренд: " + brand  +
                ", модель: " + model +
                ", а объем двигателя: " + volumeEngine;
    }
}
