package com.pehls.healthcare.Pessoa.BO;

import com.pehls.healthcare.Pessoa.BO.IMC;
import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;
import com.pehls.healthcare.Utils.Person;
import com.pehls.healthcare.Utils.VerifyManBy;
import com.pehls.healthcare.Utils.VerifyWomanBy;

/**
 * Created by gabri on 02/11/2017.
 */

public class TGC {
    public static Float calculate(PessoaInterface pessoa) {
        return (1.2F * IMC.calculate(pessoa)) - (10.8F * pessoa.getS()) + (0.23F * pessoa.getAge()) - 5.4F;
    }
    public static String evaluate(PessoaInterface pessoa) {
       return (pessoa.getGenderFlag() == Person.isMan) ? evaluateMan(pessoa) : evaluateWoman (pessoa);
    }

    private static String evaluateWoman(PessoaInterface pessoa) {
        return new VerifyWomanBy().ageOf(pessoa);
    }

    private static String evaluateMan (PessoaInterface pessoa) {
            return new VerifyManBy().ageOf(pessoa);

    }
}
