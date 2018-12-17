package com.bts.morinbetend.rollerdicegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gameActivity extends AppCompatActivity {

    private Partie _partie;

    private Button btnLancer, btnRetour, btnStop;
    private TextView tvLancersRestants, tvScoreTotalLancer, tvScoreLancer;
    private EditText etNom;
    private int _tour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initializeIHM();
        btnLancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNom != "") {

                }

            }
        });
    }



    private void initializeIHM() {
        btnLancer = findViewById(R.id.btn_lancer);
        btnRetour = findViewById(R.id.btn_retour);
        btnStop = findViewById(R.id.btn_stop);
        tvLancersRestants = findViewById(R.id.tv_lancersRestants);
        tvScoreLancer = findViewById(R.id.tv_scoreLancer);
        tvScoreTotalLancer = findViewById(R.id.tv_scoreTotalLancer);
        etNom = findViewById(R.id.et_nom);
    }
}
