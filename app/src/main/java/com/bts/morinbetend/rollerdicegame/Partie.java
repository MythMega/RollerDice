package com.bts.morinbetend.rollerdicegame;

import java.util.ArrayList;

public class Partie {
    private int _numero;
    private int point;
    private ArrayList<Lancer> _lesLancers = new ArrayList<Lancer>();

    public Partie(int unNumero)
    {
        _numero = unNumero;
    }

    public void ajouterLancers(Lancer unLancer)
    {
        if (verifierValidite() ) { _lesLancers.add(unLancer); }

    }

    private boolean verifierValidite() {
        if (_lesLancers.size() < 10) { return true; }
        else {return false;}
        }
}