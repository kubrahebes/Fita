package com.example.user.fita;

/**
 * Created by elifasli on 10.03.2018.
 */

public class Thin {
    public static final String TAG = Thin.class.getSimpleName();
    public static final String TABLE = "Thin";
    // Labels Table Columns names
    public static final String KEY_ThinId = "ThinId";
    public static final String KEY_Kahvalti = "Kahvalti";
    public static final String KEY_AraOgun1 = "Ara Ogun1";
    public static final String KEY_OgleYemegi = "Ogle Yemegi";
    public static final String KEY_AraOgun2 = "Ara Ogun2";
    public static final String KEY_Aksam = "Aksam";
    public static final String KEY_KitleIndex = "Kitle Index";

    private String thinId;
    private String kahvalti;
    private String araogun1;
    private String ogleyemegi;
    private String araogun2;
    private String aksam;
    private String kitleIndex;

    public static String getKEY_ThinId() {
        return KEY_ThinId;
    }

    public static String getKEY_Kahvalti() {
        return KEY_Kahvalti;
    }

    public String getThinId() {
        return thinId;
    }

    public void setThinId(String thinId) {
        this.thinId = thinId;
    }

    public String getKahvalti() {
        return kahvalti;
    }

    public void setKahvalti(String kahvalti) {
        this.kahvalti = kahvalti;
    }

    public String getAraogun1() {
        return araogun1;
    }

    public void setAraogun1(String araogun1) {
        this.araogun1 = araogun1;
    }

    public String getOgleyemegi() {
        return ogleyemegi;
    }

    public void setOgleyemegi(String ogleyemegi) {
        this.ogleyemegi = ogleyemegi;
    }

    public String getAraogun2() {
        return araogun2;
    }

    public void setAraogun2(String araogun2) {
        this.araogun2 = araogun2;
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
}
