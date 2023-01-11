package enumPackage;

public enum LoadCapacityType {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float minLoadCapacity;
    private final Float maxLoadCapacity;

    LoadCapacityType(Float minLoadCapacity, Float maxLoadCapacity) {
        this.minLoadCapacity = minLoadCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        if(minLoadCapacity == null){
            return "Грузоподъемность до: " + maxLoadCapacity + " тонн";
        } else if (maxLoadCapacity == null) {
            return "Грузоподъемность от: " + minLoadCapacity + " тонн";
        }else {
            return "Грузоподъемность от: " + minLoadCapacity + " тонн" +
            " до: " + maxLoadCapacity + " тонн";
        }
    }
}
