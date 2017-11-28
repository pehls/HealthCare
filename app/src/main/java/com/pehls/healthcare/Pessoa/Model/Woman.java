package com.pehls.healthcare.Pessoa.Model;

import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;
import com.pehls.healthcare.Utils.Person;

/**
 * Created by gabri on 01/11/2017.
 */

public class Woman extends PersonAbs implements PessoaInterface {
    private String gender;
    private int S, K, ID;
    public Woman() {
        gender = "Woman";
        S = 0;
        K = 2;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public Person getGenderFlag() {
        return Person.isWoman;
    }

    @Override
    public int getK() {
        return K;
    }

    public int getS() {
        return S;
    }

    @Override
    public int getID() {
        return ID;
    }


}
