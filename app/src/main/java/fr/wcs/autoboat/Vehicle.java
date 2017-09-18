package fr.wcs.autoboat;

public class Vehicle {

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String brand;
    private String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getDescription(){
        return "Marque : " + brand + "\nModèle : " + model;
    }



}
