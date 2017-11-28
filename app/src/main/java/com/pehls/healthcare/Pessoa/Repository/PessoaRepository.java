package com.pehls.healthcare.Pessoa.Repository;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;

import java.util.HashMap;

/**
 * Created by gabri on 11/11/2017.
 */

public class PessoaRepository {

    // fields for the database
    public static final String GENDER = "gender";
    public static final String AGE = "age";
    public static final String WEIGHT = "weight";
    public static final String HEIGHT = "height";
    public static final String S = "s";
    public static final String K = "k";
    public static final String ID = "_id";
    public static final String NAME = "name";
    public static final String IMC = "imc";
    public static final String EVALIMC = "evalimc";
    public static final String IW = "iw";
    public static final String TGC = "tgc";
    public static final String EVALTGC = "evaltgc";

    // integer values used in content URI
    static final int PESSOA = 1;
    static final int PESSOA_ID = 2;

    DBHelper dbHelper;

    // database declarations
    private SQLiteDatabase database;
    static final String DATABASE_NAME = "pessoa";
    static final String TABLE_NAME = "pessoa";
    static final int DATABASE_VERSION = 1;
    static final String CREATE_TABLE =
            " CREATE TABLE " + TABLE_NAME +
                    " (_id INTEGER PRIMARY KEY, " +
                    " name TEXT NOT NULL, " +
                    " gender TEXT NOT NULL, " +
                    " age TEXT NOT NULL, " +
                    " weight TEXT NOT NULL, " +
                    " height TEXT NOT NULL, " +
                    " s TEXT NOT NULL, " +
                    " imc TEXT NOT NULL, " +
                    " evalimc TEXT NOT NULL, " +
                    " iw TEXT NOT NULL, " +
                    " tgc TEXT NOT NULL, " +
                    " evaltgc TEXT NOT NULL, " +
                    " k TEXT NOT NULL) ; ";

    public PessoaRepository() {
    }


    // class that creates and manages the provider's database
    public static class DBHelper extends SQLiteOpenHelper {

        public DBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO Auto-generated method stub
            db.execSQL(CREATE_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // TODO Auto-generated method stub
            Log.w(DBHelper.class.getName(),
                    "Upgrading database from version " + oldVersion + " to "
                            + newVersion + ". Old data will be destroyed");
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
        }

    }

}