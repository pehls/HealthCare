package com.pehls.healthcare.Pessoa.Interfaces;

import com.pehls.healthcare.Pessoa.BO.TGC;

/**
 * Created by gabri on 02/11/2017.
 */

public abstract class AgeVerify {
    private PessoaInterface pessoaLocal;
    public abstract String isGreatherThan60();

    public abstract String isBetween50and59();

    public abstract String isBetween40and49();

    public abstract String isBetween30and39();

    public abstract String isUnder30();

    public abstract String ageOf(PessoaInterface pessoa);

    public void setPessoaLocal(PessoaInterface pessoaLocal) {
        this.pessoaLocal = pessoaLocal;
    }

    protected boolean ageIsBetween(int n, int n2) {
        return ageIsGreatherOrEqual(n) && ageIsLessOrEqual(n2);
    }
    private boolean ageIsGreatherOrEqual(int n) {
        return (pessoaLocal.getAge() >= n);
    }
    private boolean ageIsLessOrEqual(int n) {
        return (pessoaLocal.getAge() <= n);
    }
    protected boolean ageIsLessThen(int n) {
        return (pessoaLocal.getAge() < n);
    }
    protected boolean tgcLessOrEqual(float n) {
        return TGC.calculate(pessoaLocal) <= n;
    }
    protected boolean tgcBetween(float n, float n1) {
        return TGC.calculate(pessoaLocal) > n && TGC.calculate(pessoaLocal) <= n1;
    }
    protected boolean tgcGreatherThen(float n) {
        return TGC.calculate(pessoaLocal) > n;
    }
}
