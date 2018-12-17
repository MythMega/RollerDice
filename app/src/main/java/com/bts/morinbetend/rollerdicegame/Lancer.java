package com.bts.morinbetend.rollerdicegame;

import java.util.Random;

public class Lancer {
    private  int _numero;
    private int _desUn;
    private int _desDeux;

    public Lancer(int unNumeroId, int unNumeroDesUn, int unNumeroDesDeux) {
        this._numero = unNumeroId;
        this._desUn = unNumeroDesUn;
        this._desDeux = unNumeroDesDeux;
    }

    public void LancerDes() {
        int alea = new Random().nextInt(6);  // [0...5]
        int alea2 = new Random().nextInt(6);  // [0...5]
        alea += 1; //pour mettre entre 1 & 6
        alea += 2; //pour mettre entre 1 & 6
        _desUn = alea;
        _desDeux = alea2;
    }
}
