package com.giray.entity;

public class Hayvan {
    /**
     * Özelliklerin alýnacaðý bir Parent sýnýfý oluþturalým.
     */
    public String ad;
    public String cins;
    public String tur;
    public int disSayisi;
    public int ayakSayisi;
    public boolean kuyruguVarMi;
    public boolean yuzgeciVarMi;
    public boolean tuyuVarMi;
    public String renk;
    public double agirlik;
    public double boy;
    public boolean kiliVarMi;
    public boolean puluVarMi;
    public boolean yuzebiliyorMu;
    public boolean ucabiliyorMu;
    public boolean kosabiliyorMu;
    public boolean zehirliMi;

    /**
     * Bu method Hayvan sýnýfýnýn içindeki tüm özelliklerin
     * listesini String olarak döner.
     *
     */
    @Override
    public String toString() {
        return "Hayvan{" +
                "ad='" + ad + '\'' +
                ", cins='" + cins + '\'' +
                ", tur='" + tur + '\'' +
                ", disSayisi=" + disSayisi +
                ", ayakSayisi=" + ayakSayisi +
                ", kuyruguVarMi=" + kuyruguVarMi +
                ", yuzgeciVarMi=" + yuzgeciVarMi +
                ", tuyuVarMi=" + tuyuVarMi +
                ", renk='" + renk + '\'' +
                ", agirlik=" + agirlik +
                ", boy=" + boy +
                ", kiliVarMi=" + kiliVarMi +
                ", puluVarMi=" + puluVarMi +
                ", yuzebiliyorMu=" + yuzebiliyorMu +
                ", ucabiliyorMu=" + ucabiliyorMu +
                ", kosabiliyorMu=" + kosabiliyorMu +
                ", zehirliMi=" + zehirliMi +
                '}';
    }
}
