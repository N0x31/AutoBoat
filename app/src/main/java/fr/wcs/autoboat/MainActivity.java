package fr.wcs.autoboat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    int type = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final EditText marque = (EditText) findViewById(R.id.marque);
        final EditText modele = (EditText) findViewById(R.id.modele);
        final EditText kilometres = (EditText) findViewById(R.id.kilometres);
        final EditText nbreHeures = (EditText) findViewById(R.id.nbreHeures);
        final EditText power = (EditText) findViewById(R.id.power);
        final Button envoyer = (Button) findViewById(R.id.envoyer);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                type = i;
                if (i == 0) {
                    marque.setVisibility(View.GONE);
                    modele.setVisibility(View.GONE);
                    kilometres.setVisibility(View.GONE);
                    nbreHeures.setVisibility(View.GONE);
                    power.setVisibility(View.GONE);
                    envoyer.setEnabled(false);
                }

                else if (i == 1) {
                    marque.setVisibility(View.VISIBLE);
                    modele.setVisibility(View.VISIBLE);
                    kilometres.setVisibility(View.VISIBLE);
                    nbreHeures.setVisibility(View.GONE);
                    power.setVisibility(View.GONE);
                    envoyer.setEnabled(true);
                }

                else if (i == 2) {
                    marque.setVisibility(View.VISIBLE);
                    modele.setVisibility(View.VISIBLE);
                    kilometres.setVisibility(View.GONE);
                    nbreHeures.setVisibility(View.VISIBLE);
                    power.setVisibility(View.GONE);
                    envoyer.setEnabled(true);
                }

                else if (i == 3) {
                    marque.setVisibility(View.VISIBLE);
                    modele.setVisibility(View.VISIBLE);
                    kilometres.setVisibility(View.GONE);
                    nbreHeures.setVisibility(View.GONE);
                    power.setVisibility(View.VISIBLE);
                    envoyer.setEnabled(true);
                }
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, VehicleActivity.class);
                intent.putExtra("type", type);
                intent.putExtra("marque", marque.getText().toString());
                intent.putExtra("modele", modele.getText().toString());
                intent.putExtra("kilometres", kilometres.getText().toString());
                intent.putExtra("nbreHeures", nbreHeures.getText().toString());
                intent.putExtra("power", power.getText().toString());

                startActivity(intent);
            }
        });
    }
}
