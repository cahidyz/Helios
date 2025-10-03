package lesson6.homework;

public class Car extends Manufacturer {
    String model;
    Manufacturer manufacturer;
    int productionYear;
    double engineSize;
    String fuelType;
    int price;

    public Car(String model, Manufacturer manufacturer, int productionYear, double engineSize, String fuelType, int price) {
        super(manufacturer.name, manufacturer.foundationYear, manufacturer.country);
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return model + " | "
                + manufacturer.getName() + " | "
                + productionYear + " | "
                + (engineSize / 1000.0) + "L | "
                + fuelType + " | $"
                + (price / 1000.0) + "K";
    }
}
