package com.pehls.healthcare.Pessoa.Model;

import com.pehls.healthcare.Pessoa.Model.Man;
import com.pehls.healthcare.Pessoa.Model.PessoaBO;
import com.pehls.healthcare.Pessoa.BO.TGC;
import com.pehls.healthcare.Pessoa.Model.Woman;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by gabri on 02/11/2017.
 */

public class TGCTest {
    PessoaBO woman, man;
    TGC tgc;
    @Before
    public void setUp () {
        woman = new PessoaBO(new Woman());
        man = new PessoaBO (new Man());
        tgc = new TGC();
    }
    @Test
    public void tgc_assertWomanNotNull() throws Exception {
        assertNotNull(woman);
    }
    @Test
    public void tgc_assertManNotNull() throws Exception {
        assertNotNull(man);
    }
    @Test
    public void tgc_assertIdealWeightNotNull() throws Exception {
        assertNotNull(tgc);
    }
    @Test
    public void tgc_calculateWoman() throws Exception {
        assertEquals(24.11F, tgc.calculate(woman.setAge(20).setHeight(1.7F).setWeight(60F)), 0.01F);
    }
    @Test
    public void tgc_calculateMan() throws Exception {
        assertEquals(13.31F, tgc.calculate(man.setAge(20).setHeight(1.7F).setWeight(60F)), 0.01F);
    }
    @Test
    public void person_manEvaluateTGCNotAccept() throws Exception {
        assertEquals("Não aceitável", tgc.evaluate(man.setAge(20).setHeight(1.70F).setWeight(90F)));
    }
    @Test
    public void person_womanEvaluateTGCNotAccept() throws Exception {
        assertEquals("Não aceitável", tgc.evaluate(woman.setAge(20).setHeight(1.70F).setWeight(90F)));

    }
    @Test
    public void person_manEvaluateTGCAccept() throws Exception {
        assertEquals("Aceitável", tgc.evaluate(man.setAge(20).setHeight(1.70F).setWeight(56F)));
    }
    @Test
    public void person_womanEvaluateTGCAccept() throws Exception {
        assertEquals("Aceitável", tgc.evaluate(woman.setAge(20).setHeight(1.70F).setWeight(45F)));
    }
    @Test
    public void person_manEvaluateTGCIdeal() throws Exception {
        assertEquals("Ideal", tgc.evaluate(man.setAge(20).setHeight(1.70F).setWeight(48F)));
    }
    @Test
    public void person_womanEvaluateTGCIdeal() throws Exception {
        assertEquals("Ideal", tgc.evaluate(woman.setAge(20).setHeight(1.70F).setWeight(38F)));
    }
}
