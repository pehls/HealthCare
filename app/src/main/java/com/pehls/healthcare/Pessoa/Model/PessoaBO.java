package com.pehls.healthcare.Pessoa.Model;

import com.pehls.healthcare.Pessoa.BO.IMC;
import com.pehls.healthcare.Pessoa.BO.IdealWeight;
import com.pehls.healthcare.Pessoa.BO.TGC;
import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;
import com.pehls.healthcare.Utils.Person;

/**
 * Created by gabri on 01/11/2017.
 */

public class PessoaBO implements PessoaInterface {
    private PersonAbs pessoa;
    public PessoaBO(Woman woman) {
        this.pessoa = woman;
    }

    public PessoaBO(Man man) {
        this.pessoa = man;
    }

    @Override
    public String getGender() {
        return pessoa.getGender();
    }

    @Override
    public Person getGenderFlag() {
        return pessoa.getGenderFlag();
    }

    public PessoaInterface setWeight(float weight) {
        return pessoa.setWeight(weight);
    }

    @Override
    public float getWeight() {
        return pessoa.getWeight();
    }

    @Override
    public PessoaInterface setHeight(float height) {
        return pessoa.setHeight(height);
    }

    @Override
    public float getHeight() {
        return pessoa.getHeight();
    }

    public float calculateIMC() {
        return IMC.calculate(pessoa);
    }

    public String evaluateIMC() {
        return IMC.evaluate(pessoa);
    }

    @Override
    public PessoaInterface setAge(int age) {
        return this.pessoa.setAge(age);
    }

    @Override
    public int getAge() {
        return pessoa.getAge();
    }

    public Float calculateTGC() {
        return TGC.calculate(pessoa);
    }

    public String evaluateTGC() {
        return TGC.evaluate(pessoa);
    }

    @Override
    public int getS() {
        return pessoa.getS();
    }

    public float calculateIdealWeight() {
        return IdealWeight.calculate(pessoa);
    }

    @Override
    public int getK() {
        return pessoa.getK();
    }

    @Override
    public int getID() {return pessoa.getID();}

    @Override
    public String getName() {
        return pessoa.getName();
    }

    public PessoaInterface setName(String name) {
        return pessoa.setName(name);
    }
}
