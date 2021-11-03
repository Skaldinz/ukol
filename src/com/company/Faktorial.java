package com.company;

public class Faktorial {

    public int faktorial(byte n){
        int vysledek;
        if(n == 1)
            return 1;
        vysledek = faktorial((byte) (n-1)) * n;
        return vysledek;
    }
}

