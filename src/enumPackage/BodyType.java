package enumPackage;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COMPARTMENT("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRACK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyType;
    }
}
