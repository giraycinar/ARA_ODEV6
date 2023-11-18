package com.giray;

import com.giray.entity.Balik;
import com.giray.entity.Kedi;
import com.giray.entity.Kus;
import com.giray.entity.Yilan;

public class Runner {
    public static void main(String[] args) {
        /**
         * Hayvanlar alemi soya�ac� olu�turunuz. Bunu yaparken OOP ve kal�t�mdan yararlan�n�z.
         * Hayvan s�n�f� en �stte(parent class),
         * miras alacak olanlar ise kedi, bal�k, ku�, y�lan v.s. �eklinde bir projeyi kodlay�n�z.
         */
        //burada nesneleri olu�turuyoruz.
        Balik balik = new Balik();
        Kedi kedi = new Kedi();
        Yilan yilan = new Yilan();
        Kus kus = new Kus();

        //kedi �zellikleri.
        kedi.ad="Buz";
        kedi.cins="Felis";
        kedi.tur="Maine Coon";
        kedi.agirlik=3;
        kedi.ayakSayisi=4;
        kedi.disSayisi=30;
        kedi.kiliVarMi=true;
        kedi.boy=30;
        kedi.kosabiliyorMu=true;
        kedi.kuyruguVarMi=true;
        kedi.puluVarMi=false;
        kedi.renk="kahve";
        kedi.yuzebiliyorMu=true;
        kedi.yuzgeciVarMi=false;
        kedi.zehirliMi=false;
        kedi.ucabiliyorMu=false;
        kedi.tuyuVarMi=false;
        System.out.println(kedi.toString());


        //kus �zellikleri.
        kus.ad="K�l";
        kus.cins="Saxicola";
        kus.tur="S. torguata";
        kus.agirlik=0.2;
        kus.ayakSayisi=2;
        kus.disSayisi=0;
        kus.kiliVarMi=false;
        kus.boy=0.1;
        kus.kosabiliyorMu= false;
        kus.kuyruguVarMi= true;
        kus.puluVarMi=true;
        kus.renk="sar�";
        kus.yuzebiliyorMu=false;
        kus.yuzgeciVarMi=false;
        kus.zehirliMi=false;
        kus.ucabiliyorMu=true;
        kus.tuyuVarMi=true;
        System.out.println(kus.toString());

        //bal�k �zellikleri.
        balik.ad="Hamsi";
        balik.cins="Engraulis";
        balik.tur="encrasicolus maeticus";
        balik.agirlik=0.1;
        balik.ayakSayisi=0;
        balik.disSayisi=20;
        balik.kiliVarMi=false;
        balik.boy=0.1;
        balik.kosabiliyorMu= false;
        balik.kuyruguVarMi= true;
        balik.puluVarMi=true;
        balik.renk="g�m��";
        balik.yuzebiliyorMu=true;
        balik.yuzgeciVarMi=true;
        balik.zehirliMi=false;
        balik.ucabiliyorMu=false;
        balik.tuyuVarMi=false;
        System.out.println(balik.toString());

        //y�lan �zellikleri.
        yilan.ad="Engerek";
        yilan.cins="Vipera";
        yilan.tur="Viperinae";
        yilan.agirlik=6;
        yilan.ayakSayisi=0;
        yilan.disSayisi=2;
        yilan.kiliVarMi=false;
        yilan.boy=3;
        yilan.kosabiliyorMu= false;
        yilan.kuyruguVarMi= true;
        yilan.puluVarMi=true;
        yilan.renk="kahve-sar�";
        yilan.yuzebiliyorMu=true;
        yilan.yuzgeciVarMi=false;
        yilan.zehirliMi=true;
        yilan.ucabiliyorMu=false;
        yilan.tuyuVarMi=false;
        System.out.println(yilan.toString());





    }
}
