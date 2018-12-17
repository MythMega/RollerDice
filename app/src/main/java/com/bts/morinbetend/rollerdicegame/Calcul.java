package com.bts.morinbetend.rollerdicegame;

import java.util.Random;

public class Calcul {
    public static int GenererLancerDes(){
        int alea2 = new Random().nextInt(6);  // [0...5]
        alea2 += 1; // [1...6]
        return alea2; }
}
