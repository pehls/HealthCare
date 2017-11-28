package com.pehls.healthcare.Pessoa.BO;

import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;
import com.pehls.healthcare.Utils.Person;

/**
 * Created by gabri on 03/11/2017.
 */

public class IMC {

    public static float calculate(PessoaInterface pessoa) {
        return pessoa.getWeight()/ (pessoa.getHeight() * pessoa.getHeight());
    }

    public static String evaluate(PessoaInterface pessoa) {
        return (pessoa.getGenderFlag()== Person.isMan)? evaluateMan(pessoa) : evaluateWoman(pessoa);
    }

    private static String evaluateMan(PessoaInterface pessoa) {
        return manIsUnderWeight(pessoa);
    }

    private static String evaluateWoman(PessoaInterface pessoa) {
        return womanIsUnderWeight(pessoa);
    }

    private static String manIsUnderWeight(PessoaInterface pessoa) {
        return (calculate(pessoa)<20.7F) ? "Abaixo do Peso" :  manIsAtIdealWeight(pessoa);
    }
    private static String manIsAtIdealWeight(PessoaInterface pessoa) {
        return (calculate(pessoa) >= 20.7F && calculate(pessoa) <= 26.4F) ? "No Peso Ideal" : manIsOverWeight(pessoa);
    }
    private static String manIsOverWeight(PessoaInterface pessoa) {
        return (calculate(pessoa) > 26.4F) ? "Obeso" : "Erro Inesperado!";
    }

    private static String womanIsUnderWeight(PessoaInterface pessoa) {
        return (calculate(pessoa) < 19.1F)? "Abaixo do Peso" : womanIsAtIdealWeight(pessoa);
    }

    private static String womanIsAtIdealWeight(PessoaInterface pessoa) {
        return (calculate(pessoa) >= 19.1F && calculate(pessoa) <= 25.8F) ? "No Peso Ideal" : womanIsOverWeight(pessoa) ;
    }

    private static String womanIsOverWeight(PessoaInterface pessoa) {
        return (calculate(pessoa)>25.8F ) ? "Obeso" : "Erro Inesperado!";
    }




}
