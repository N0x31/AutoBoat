package fr.wcs.autoboat;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class VehicleActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehicle_activity);

        Intent intent = getIntent();
        int type = getIntent().getIntExtra("type", 0);
        String marque = getIntent().getStringExtra("marque");
        String modele = getIntent().getStringExtra("modele");
        String kilometres = getIntent().getStringExtra("kilometres");
        String nbreHeures = getIntent().getStringExtra("nbreHeures");

        TextView description = (TextView)findViewById(R.id.description);

        if (type == 1){
            VehicleCar car = new VehicleCar(marque, modele, kilometres);
            description.setText(car.getDescription());
        }

        else if (type == 2){
            VehicleBoat boat = new VehicleBoat(marque, modele, nbreHeures);
            description.setText(boat.getDescription());
        }
    }

}
