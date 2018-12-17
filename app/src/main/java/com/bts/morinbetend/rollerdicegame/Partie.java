package com.bts.morinbetend.rollerdicegame;

import java.util.ArrayList;

public class Partie {
    private int _numero;
    private int _point;
    private ArrayList<Lancer> _lesLancers = new ArrayList<Lancer>();
    private String _playerName;

    public Partie(int unNumero, String unNom)
    {
        _numero = unNumero;
        _playerName = unNom;
    }

    public void ajouterLancers(Lancer unLancer)
    {
        if (verifierValidite() ) { _lesLancers.add(unLancer); }

    }

    private boolean verifierValidite() {
        if (_lesLancers.size() < 10) { return true; }
        else {return false;}
    }

    private void set_Point()
    {
        int resultat = 0;
        for(Lancer monLancer : _lesLancers)
        {
            resultat += monLancer.get_resultatDes();
        }
    }

    private void set_playerName(String unNom) {_playerName = unNom;}
    private int get_point() {return _point;}
    private ArrayList<Lancer> get_lesLancers(){return _lesLancers;}
    private String VersChaine() {return _playerName + "  ->  " + _point; }
}