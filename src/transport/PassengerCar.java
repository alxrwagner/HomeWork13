package transport;

import driver.DriverCar;
import driver.DriverB;

public class PassengerCar extends Transport<DriverB> implements ICompeting {

    public PassengerCar(String brand, String model, float volumeEngine, DriverB driver) {
        super(brand, model, volumeEngine, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Я не знаю, что такое пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Мое лучшее время круга: 3 секунды! У меня много свидетелей!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Моя максимальная скорость равна скорости света, такие дела =^__^=");
    }

    @Override
    public String toString() {
        return "Я - легковой ААААААААвтомобиииль, мой бренд: " + brand  +
                ", модель: " + model +
                ", а объем двигателя: " + volumeEngine;
    }
}
