package driver;

import enumPackage.DriverLicenseType;

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
}
