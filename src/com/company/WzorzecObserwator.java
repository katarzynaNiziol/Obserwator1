package com.company;

public class WzorzecObserwator {

    public static void main(String[] args) {

        StacjaPogodowa sp = new StacjaPogodowa(22);

        CzytnikTemperatury ct1 = new CzytnikTemperatury(1);

        sp.dodajOdbiorce(ct1);

        sp.setTemperatura(27);

        CzytnikTemperatury ct2 = new CzytnikTemperatury(2);
        sp.dodajOdbiorce(ct2);

        sp.setTemperatura(27);


    }
}
