package com.pehls.healthcare.Utils;

import com.pehls.healthcare.Pessoa.Interfaces.AgeVerify;
import com.pehls.healthcare.Pessoa.Interfaces.PessoaInterface;

/**
 * Created by gabri on 02/11/2017.
 */

public class VerifyManBy extends AgeVerify {

    public String ageOf(PessoaInterface pessoa) {
        super.setPessoaLocal(pessoa);
        return isUnder30();
    }

    @Override
    public String isGreatherThan60() {
        return tgcLessOrEqual(16.5F) ? "Ideal" : ((tgcBetween(16.5F, 20.5F)) ? "Aceitável" : ((tgcGreatherThen(20.5F)) ? "Não aceitável" : "Erro"));
    }

    @Override
    public String isBetween50and59() {
        return isGreatherThan60();
    }

    @Override
    public String isBetween40and49() {
        if (ageIsBetween(40, 49))
            return tgcLessOrEqual(15F) ? "Ideal" : tgcBetween(15F, 19F) ? "Aceitável" : (tgcGreatherThen(19F)) ? "Não aceitável" : "Erro";
        return isBetween50and59();
    }

    @Override
    public String isBetween30and39() {
        if (ageIsBetween(30, 39))
            return (tgcLessOrEqual(12.5F)) ? "Ideal" : (tgcBetween(12.5F, 16.5F)) ? "Aceitável" : (tgcGreatherThen(16.5F)) ? "Não aceitável" : "Erro";
        return isBetween40and49();
    }

    @Override
    public String isUnder30() {
        if (ageIsLessThen(30))
            return (tgcLessOrEqual(9F)) ? "Ideal" : (tgcBetween(9F, 13F)) ? "Aceitável" : (tgcGreatherThen(13F)) ? "Não aceitável" : "Erro";
        return isBetween30and39();
    }

}
