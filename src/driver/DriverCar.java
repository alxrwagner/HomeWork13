package driver;

import enumPackage.DriverLicenseType;

import java.util.Objects;

public class DriverCar {

    protected String fullName;
    protected boolean isDriverLicense;
    protected int experience;
    protected DriverLicenseType typeOfDriverLicense;

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

    public boolean isDriverLicense() {
        return isDriverLicense;
    }

    private void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public DriverLicenseType getTypeOfDriverLicense() {
        return typeOfDriverLicense;
    }

    public void setTypeOfDriverLicense(DriverLicenseType typeOfDriverLicense) {
        if(typeOfDriverLicense == null){
            this.typeOfDriverLicense = null;
            setDriverLicense(false);
        } else {
            this.typeOfDriverLicense = typeOfDriverLicense;
            setDriverLicense(true);
        }
    }

    @Override
    public String toString() {
        return "Водитель: " + fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverCar driverCar = (DriverCar) o;
        return isDriverLicense() == driverCar.isDriverLicense() && getExperience() == driverCar.getExperience() && Objects.equals(fullName, driverCar.fullName) && getTypeOfDriverLicense() == driverCar.getTypeOfDriverLicense();
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, isDriverLicense(), getExperience(), getTypeOfDriverLicense());
    }
}
