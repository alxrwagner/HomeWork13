package transport;

public enum PassengerCapacityType {
    ESPECIALLY_SMALL(null, 10),
    SMALL(null, 25),
    AVERAGE(40, 50),
    LARGE(60, 80),
    ESPECIALLY_LARGE(100, 120);

    private final Integer minPassengerCapacityType;
    private final Integer maxPassengerCapacityType;

    PassengerCapacityType(Integer minPassengerCapacityType, Integer miaxPassengerCapacityType) {
        this.minPassengerCapacityType = minPassengerCapacityType;
        this.maxPassengerCapacityType = miaxPassengerCapacityType;
    }

    @Override
    public String toString() {
        if(minPassengerCapacityType == null){
            return "Вместимость: до: " + maxPassengerCapacityType + " мест";
        } else if (maxPassengerCapacityType == null) {
            return "Вместимость: от: " + minPassengerCapacityType + " мест";
        }else {
            return "Вместимость: от: " + minPassengerCapacityType + " до: " + maxPassengerCapacityType + " мест";
        }
    }
}
