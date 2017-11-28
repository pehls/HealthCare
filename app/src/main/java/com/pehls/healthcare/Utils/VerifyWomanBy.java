package com.pehls.healthcare.Utils;

import com.pehls.healthcare.Pessoa.Interfaces.AgeVerify;
import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;

/**
 * Created by gabri on 02/11/2017.
 */

public class VerifyWomanBy extends AgeVerify {
    @Override
    public String ageOf(PessoaInterface pessoa) {
        super.setPessoaLocal(pessoa);
        return isUnder30();
    }
    @Override
    public String isUnder30() {
        if (ageIsLessThen(30))
            return (tgcLessOrEqual(16F)) ? "Ideal" : (tgcBetween(16F,18F)) ? "Aceitável" : (tgcGreatherThen(18F)) ? "Não aceitável" : "Erro";
        return isBetween30and39();
    }
    @Override
    public String isBetween30and39() {
        if (ageIsBetween(30,39))
            return (tgcLessOrEqual(18F)) ? "Ideal" : (tgcBetween(18F,20F)) ? "Aceitável" : (tgcGreatherThen(20F)) ? "Não aceitável" : "Erro";
        return isBetween40and49();
    }
    @Override
    public String isBetween40and49() {
        if (ageIsBetween(40,49))
            return (tgcLessOrEqual(18.5F)) ? "Ideal" : (tgcBetween(18.5F, 23.5F)) ? "Aceitável" : (tgcGreatherThen(23.5F)) ? "Não aceitável" : "Erro";
        return isBetween50and59();
    }
    @Override
    public String isBetween50and59() {
        if (ageIsBetween(50, 59))
            return (tgcLessOrEqual(21.5F)) ? "Ideal" : (tgcBetween(21.5F, 26.5F)) ? "Aceitável" : (tgcGreatherThen(26.5F)) ? "Não aceitável" : "Erro";
        return isGreatherThan60();
    }
    @Override
    public String isGreatherThan60() {
        return (tgcLessOrEqual(22.5F)) ? "Ideal" : (tgcBetween(22.5F, 27.5F)) ? "Aceitável" : (tgcGreatherThen(27.5F)) ? "Não aceitável" : "Erro";
    }

}
