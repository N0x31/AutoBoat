package fr.wcs.autoboat;

public class VehicleBoat extends Vehicle {

    private String hours;

    public VehicleBoat(String brand, String model, String hours) {
        super(brand, model);
        this.hours = hours;
    }

}
