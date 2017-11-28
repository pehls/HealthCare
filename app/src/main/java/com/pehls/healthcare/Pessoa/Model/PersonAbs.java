package com.pehls.healthcare.Pessoa.Model;

import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;

/**
 * Created by gabri on 14/11/2017.
 */

public abstract class PersonAbs implements PessoaInterface {
    private float weight, height = 0;
    private int age ;
    private String name;

    public PessoaInterface setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public PessoaInterface setHeight(float height) {
        this.height = height;
        return this;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public PessoaInterface setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PessoaInterface setWeight(float weight) {
        this.weight = weight;
        return this;
    }

}
