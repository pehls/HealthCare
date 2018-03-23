package com.pehls.healthcare.Pessoa.Interfaces;

import com.pehls.healthcare.Utils.Person;

/**
 * Created by gabri on 01/11/2017.
 */

public interface PessoaInterface {
    String getGender();
    Person getGenderFlag();
    PessoaInterface setWeight(float weight);
    float getWeight();
    PessoaInterface setHeight(float height);
    float getHeight();
    PessoaInterface setAge(int age);
    int getAge();
    int getS();
    int getK();
    int getID();
    String getName();
}
