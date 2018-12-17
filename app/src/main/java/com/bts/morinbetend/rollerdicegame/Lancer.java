package com.bts.morinbetend.rollerdicegame;

import java.util.Random;
import com.bts.morinbetend.rollerdicegame.Calcul;

public class Lancer {
    private  int _numero;
    private int _desUn;
    private int _desDeux;
    private int _resultatDes;

    public Lancer(int unNumeroId, int unNumeroDesUn, int unNumeroDesDeux) {
        this._numero = unNumeroId;
        this._desUn = unNumeroDesUn;
        this._desDeux = unNumeroDesDeux;
    }

    public void LancerDes() {
        _desUn = Calcul.GenererLancerDes();
        _desDeux = Calcul.GenererLancerDes();
        _resultatDes = _desUn + _desDeux;
    }

    public int get_desUn(){return _desUn;}
    public int get_desDeux(){return _desDeux;}
    public int get_resultatDes() {return _resultatDes;}
}
