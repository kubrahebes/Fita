package com.example.user.fita;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.user.fita.DataBase.DatabaseManager;

/**
 * Created by elifasli on 10.03.2018.
 */

public class ThinRepo {
    private Thin thin;

    public ThinRepo() {

        thin = new Thin();
    }

    public static String createTable(){
        return "CREATE TABLE " + Thin.TABLE  + "("
                + Thin.KEY_ThinId  + "   PRIMARY KEY    ,"
                + Thin.KEY_Kahvalti + " TEXT ,"
                +Thin.KEY_AraOgun1 + "TEXT, "
                +Thin.KEY_OgleYemegi+"TEXT ,"
                +Thin.KEY_AraOgun2 +"TEXT ,"
                +Thin.KEY_Aksam +"TEXT ,"
                +Thin.KEY_KitleIndex+"TEXT )";
    }


    public int insert(Thin thin) {
        int thinId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Thin.KEY_ThinId, thin.getThinId());
        values.put(Thin.KEY_Kahvalti, thin.getKahvalti());

        // Inserting Row
        thinId=(int)db.insert(Thin.TABLE, null, values);
        DatabaseManager.getInstance().closeDatabase();

        return thinId;
    }

}
