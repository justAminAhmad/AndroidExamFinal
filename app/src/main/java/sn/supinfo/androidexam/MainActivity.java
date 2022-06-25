package sn.supinfo.androidexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNom;
    private EditText txtDate;
    private EditText txtDescription;
    private EditText txtEffectif;
    private Button btnEnreg;

    private String nom = "";
    private String date = "";
    private String description = "";
    private String effectif = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNom = findViewById(R.id.txtNom);
        txtDate = findViewById(R.id.txtDate);
        txtDescription = findViewById(R.id.txtDescription);
        txtEffectif = findViewById(R.id.txtEffectif);

        btnEnreg = findViewById(R.id.btnEnreg);
        btnEnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nom = txtNom.getText().toString();
                date = txtDate.getText().toString();
                description = txtDescription.getText().toString();
                effectif = txtEffectif.getText().toString();

                if(nom.equals("") || date.equals("") || description.equals("") || effectif.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Veuillez remplir les champs", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent mintent = new Intent(MainActivity.this, MainActivity2.class);

                    mintent.putExtra("nom", nom);
                    mintent.putExtra("date", date);
                    mintent.putExtra("description", description);
                    mintent.putExtra("effectif", effectif);

                    startActivity(mintent);
                }

            }
        });

    }
}