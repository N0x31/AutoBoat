package fr.wcs.autoboat;

public class VehicleMoto extends Vehicle {

    private String power;

    public VehicleMoto(String brand, String model, String power) {
        super(brand, model);
        this.power = power;
    }


    @Override
    public String getDescription() {
        return "Type : Moto" + "\n" + super.getDescription()+ "\nPower : " + power;
    }
}
