package com.bts.morinbetend.rollerdicegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnJouer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeIHM();
        btnJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), gameActivity.class);
                startActivity(myIntent);
            }
        });
    }

    private void initializeIHM() { btnJouer = findViewById(R.id.btn_jouer); }
}
