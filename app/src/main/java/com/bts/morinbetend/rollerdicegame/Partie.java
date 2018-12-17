package com.bts.morinbetend.rollerdicegame;

import java.io.Serializable;
import java.util.ArrayList;

public class Partie implements Serializable {
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

    public void set_Point()
    {
        int resultat = 0;
        for(Lancer monLancer : _lesLancers)
        {
            resultat += monLancer.get_resultatDes();
        }
    }

    public void set_playerName(String unNom) {_playerName = unNom;}
    public int get_point() {return _point;}
    public ArrayList<Lancer> get_lesLancers(){return _lesLancers;}
    public String get_playerName() {return _playerName;}
    @Override
    public String toString() {return _playerName + "  ->  " + _point;}
}