package com.bts.morinbetend.rollerdicegame;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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
        _tour = 0 ;
        final AlertDialog alertDialog = new AlertDialog.Builder(gameActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("Entrez Votre Nom");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        btnLancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(_tour == 0)
                {
                    if(etNom.toString() != "") {
                        alertDialog.show();
                        return;
                    }
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
