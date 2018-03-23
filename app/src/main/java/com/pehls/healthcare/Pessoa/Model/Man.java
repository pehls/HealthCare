package com.pehls.healthcare.Pessoa.Model;

import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;
import com.pehls.healthcare.Utils.Person;

/**
 * Created by gabri on 01/11/2017.
 */

public class Man extends PersonAbs implements PessoaInterface{
    private String gender;
    private int S, K;
    private int ID;

    public Man() {
        gender = "Man";
        S = 1;
        K = 4;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public Person getGenderFlag() {
        return Person.isMan;
    }

    public int getS() {
        return S;
    }

    public int getK() {
        return K;
    }

    @Override
    public int getID() {
        return ID;
    }


}
