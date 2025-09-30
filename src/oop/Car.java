package oop;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String codeInputBrand, String codeInputModel, int codeInputYear) {
        this.brand = codeInputBrand;
        this.model = codeInputModel;
        this.year = codeInputYear;
    }

    public String getCarInfo() {
        return brand + " " + model + " (" + year + ")";
    }

}
