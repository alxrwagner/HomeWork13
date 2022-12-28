package transport;

import driver.DriverD;

import java.sql.Driver;

public class Bus extends Transport<DriverD> implements ICompeting {

    private PassengerCapacityType passengerCapacityType;

    public Bus(String brand, String model, float volumeEngine, DriverD driver) {
        super(brand, model, volumeEngine, driver);
    }

    @Override
    public void getType() {
        if(passengerCapacityType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println(passengerCapacityType);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Я - школьный автобус, мне такое не надо");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Какой еще круг?");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Я опять кого-то сбил... О_о");
    }

    public PassengerCapacityType getPassengerCapacityType() {
        return passengerCapacityType;
    }

    public void setPassengerCapacityType(PassengerCapacityType passengerCapacityType) {
        this.passengerCapacityType = passengerCapacityType;
    }

    @Override
    public String toString() {
        return "Я - автобус, мой бренд: " + brand  +
                ", модель: " + model +
                ", а объем двигателя: " + volumeEngine;
    }
}
