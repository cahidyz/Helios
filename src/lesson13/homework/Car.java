package lesson13.homework;

public class Car {
    private final String plateNumber;
    private final String model;

    public Car(String plateNumber, String model) {
        this.plateNumber = plateNumber;
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        // if it points to same object returns ture;
        if (this == o){
            return true;
        }

        // if it is null or from a different class returns false
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // Casting object to Car type
        Car car = (Car) o;

        // compare through plate number
        // in order to compare Strings use .equals
        return plateNumber.equals(car.plateNumber);
    }

    // 5. hashCode() metodu
    @Override
    public int hashCode() {
        // create hashcode only based on plate number
        // plateNumber.equals(other.plateNumber) true
        // helps to different Car objects to have same hashcode
        return plateNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}