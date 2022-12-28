package driver;

public class DriverCar {

    protected String fullName;

    public DriverCar(String fullName) {
        this.fullName = fullName;
    }

    public void startMove(){
        System.out.println("Начал движение");
    }

    public void stopMove(){
        System.out.println("Остановился");
    }

    public void fillUpAuto(){
        System.out.println("Заправил транспорт");
    }

    @Override
    public String toString() {
        return "Водитель: " + fullName;
    }
}
