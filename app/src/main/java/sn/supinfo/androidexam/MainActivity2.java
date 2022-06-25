package sn.supinfo.androidexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView liste = (ListView) findViewById(R.id.listGroupe);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String str_nom = bundle.getString("nom");
            String str_date = bundle.getString("date");
            String str_description = bundle.getString("description");
            String str_effectif = bundle.getString("effectif");

            String [] mylist = {str_nom, str_date, str_description, str_effectif};

            ArrayAdapter adapter = new ArrayAdapter(this, R.layout.my_list_layout, mylist);
            liste.setAdapter(adapter);
        }
    }
}