package fr.wcs.autoboat;

public class VehicleBoat extends Vehicle {

    private String hours;

    public VehicleBoat(String brand, String model, String hours) {
        super(brand, model);
        this.hours = hours;
    }

    @Override
    public String getDescription() {
        return "Type : Bateau" + "\n" + super.getDescription() + "\nNombre d'heures : " + hours;
    }
}
