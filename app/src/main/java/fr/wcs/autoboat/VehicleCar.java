package fr.wcs.autoboat;

public class VehicleCar extends Vehicle {

    private String kilometers;

    public VehicleCar(String brand, String model, String kilometers) {
        super(brand, model);
        this.kilometers = kilometers;
    }


}
