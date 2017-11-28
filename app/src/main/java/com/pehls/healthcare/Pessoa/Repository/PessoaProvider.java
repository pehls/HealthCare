package com.pehls.healthcare.Pessoa.Repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.pehls.healthcare.Pessoa.BO.IMC;
import com.pehls.healthcare.Pessoa.BO.IdealWeight;
import com.pehls.healthcare.Pessoa.BO.TGC;
import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;

/**
 * Created by gabri on 11/11/2017.
 */

public class PessoaProvider {
    private SQLiteDatabase db ;
    private PessoaRepository banco = new PessoaRepository();
    private String gender, name, age, weight, height, evalimc, imc, iw, tgc, evaltgc;

    public PessoaProvider() {
    }
    public void abreBanco(Context context) {
        banco.dbHelper = new PessoaRepository.DBHelper(context);
        db = context.openOrCreateDatabase(PessoaRepository.DATABASE_NAME, 0, null);
    }


     public String inserePessoa(PessoaInterface pessoa, Context context) {
         ContentValues valores;
         long resultado;
         db = context.openOrCreateDatabase(PessoaRepository.DATABASE_NAME, 0, null);
         db = banco.dbHelper.getWritableDatabase();
         db.delete(PessoaRepository.TABLE_NAME,PessoaRepository.ID + " = ?", new String[] {"1"});
         valores = new ContentValues();
         valores.put(PessoaRepository.ID, 1);
         valores.put(PessoaRepository.NAME, pessoa.getName());
         valores.put(PessoaRepository.AGE, pessoa.getAge());
         valores.put(PessoaRepository.GENDER, pessoa.getGender());
         valores.put(PessoaRepository.WEIGHT, pessoa.getWeight());
         valores.put(PessoaRepository.HEIGHT, pessoa.getHeight());
         valores.put(PessoaRepository.K, pessoa.getK());
         valores.put(PessoaRepository.S, pessoa.getS());
         valores.put(PessoaRepository.IW, IdealWeight.calculate(pessoa));
         valores.put(PessoaRepository.IMC, IMC.calculate(pessoa));
         valores.put(PessoaRepository.EVALIMC, IMC.evaluate(pessoa));
         valores.put(PessoaRepository.TGC, TGC.calculate(pessoa));
         valores.put(PessoaRepository.EVALTGC, TGC.evaluate(pessoa));

         resultado = db.insert(PessoaRepository.TABLE_NAME, null, valores);
         db.close();
         Log.v("Pessoa", "resultado é "+resultado);

         return (resultado == -1) ? "Erro ao inserir" : "Inserido com sucesso";

     }
     public String recuperaPessoa(int id, String what) {
         String gender, name, age, weight, height, evalimc, imc, iw, tgc, evaltgc;
         db = banco.dbHelper.getReadableDatabase();
         db.beginTransaction();
         String query = "SELECT * FROM " + PessoaRepository.DATABASE_NAME + " WHERE "+ PessoaRepository.ID + " = " + id ;
         Cursor c = db.rawQuery(query, new String[]{});
         String response = "";
         if (c.moveToFirst()) {
            response = c.getString(c.getColumnIndex(what));
         }
         c.close();
         db.endTransaction();
         db.close();
        return response;

     }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }

    public String getHeight() {
        return height;
    }

    public String getEvalimc() {
        return evalimc;
    }

    public String getImc() {
        return imc;
    }

    public String getIw() {
        return iw;
    }

    public String getTgc() {
        return tgc;
    }

    public String getEvaltgc() {
        return evaltgc;
    }
}
