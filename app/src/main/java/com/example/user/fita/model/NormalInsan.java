package com.example.user.fita.model;

/**
 * Created by User on 10.03.2018.
 */

public class NormalInsan {
    private String id;
    private String kahvalti;
    private String araOgun1;
    private String oglenYemegi;
    private String araOgun2;
    private String aksam;
    private String kitleIndex;

    public NormalInsan() {
    }

    public NormalInsan(String id, String kahvalti, String araOgun1, String oglenYemegi, String araOgun2, String aksam, String kitleIndex) {
        this.id = id;
        this.kahvalti = kahvalti;
        this.araOgun1 = araOgun1;
        this.oglenYemegi = oglenYemegi;
        this.araOgun2 = araOgun2;
        this.aksam = aksam;
        this.kitleIndex = kitleIndex;
}

    public String getOglenYemegi() {
        return oglenYemegi;
    }

    public void setOglenYemegi(String oglenYemegi) {
        this.oglenYemegi = oglenYemegi;
    }

    public String getAraOgun2() {
        return araOgun2;
    }

    public void setAraOgun2(String araOgun2) {
        this.araOgun2 = araOgun2;
    }

    public String getAksam() {
        return aksam;
    }

    public void setAksam(String aksam) {
        this.aksam = aksam;
    }

    public String getKitleIndex() {
        return kitleIndex;
    }

    public void setKitleIndex(String kitleIndex) {
        this.kitleIndex = kitleIndex;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKahvalti() {
        return kahvalti;
    }

    public void setKahvalti(String kahvalti) {
        this.kahvalti = kahvalti;
    }

    public String getAraOgun1() {
        return araOgun1;
    }

    public void setAraOgun1(String araOgun1) {
        this.araOgun1 = araOgun1;
    }
}
