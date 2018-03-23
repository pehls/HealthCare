package com.pehls.healthcare.Pessoa.BO;

import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;

/**
 * Created by gabri on 03/11/2017.
 */

public class IdealWeight {
    public static float calculate(PessoaInterface pessoa) {
        return ((pessoa.getHeight()*100)-100)-(((pessoa.getHeight()*100)-150)/pessoa.getK());
    }
}
