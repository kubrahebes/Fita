package com.example.user.fita.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.user.fita.Thin;
import com.example.user.fita.ThinRepo;

import static android.content.ContentValues.TAG;

public class DbHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "inventory.db";
        private static final int DATABASE_VERSION = 1;
        private static final String TAG = DbHelper.class.getSimpleName().toString();

        public DbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(ThinRepo.createTable());
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.d(TAG, String.format("SQLiteDatabase.onUpgrade(%d -> %d)", oldVersion, newVersion));

            // Drop table if existed, all data will be gone!!!
            db.execSQL("DROP TABLE IF EXISTS " + Thin.TABLE);
            onCreate(db);
        }
    }

