package com.bts.morinbetend.rollerdicegame;

import java.io.Serializable;
import java.util.Random;
import com.bts.morinbetend.rollerdicegame.Calcul;

public class Lancer implements Serializable {
    private  int _numero;
    private int _desUn;
    private int _desDeux;
    private int _resultatDes;

    public Lancer(int unNumeroId, int unNumeroDesUn, int unNumeroDesDeux) {
        this._numero = unNumeroId;
        this._desUn = unNumeroDesUn;
        this._desDeux = unNumeroDesDeux;
    }

    public Lancer(int unNumeroId)
    {
        this._numero = unNumeroId;
    }

    public void LancerDes() {
        _desUn = Calcul.GenererLancerDes();
        _desDeux = Calcul.GenererLancerDes();
        if((_desUn + _desDeux) == 7 ) {_resultatDes = 10; } else {_resultatDes = 0 ;}
    }

    public int get_desUn(){return _desUn;}
    public int get_desDeux(){return _desDeux;}
    public int get_resultatDes() {return _resultatDes;}
    public int get_numero() {return _numero;}
}
