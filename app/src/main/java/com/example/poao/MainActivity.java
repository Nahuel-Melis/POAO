package com.example.poao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] skills = {"Summon Mirror Mites","Clonestrike"};
        Boss MirrorMan = new Boss("Mirror Man",1000,50,50,skills);

        MirrorMan.setName("Mirror King");

        View btnStrike = findViewById(R.id.buttonStrike);

        final Warrior guerrero = new Warrior(); //TIENE que ir con final si lo meto en el coso ese de abajo

        btnStrike.setOnClickListener(new View.OnClickListener() { //tengo que implementarla, uso una Inner Class
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,guerrero.strike(),Toast.LENGTH_SHORT);
            }
        });


    }

    protected void buttonStrike(View Button){


    }
}
