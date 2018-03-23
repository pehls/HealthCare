package com.pehls.healthcare.Pessoa.Model;

import com.pehls.healthcare.Pessoa.BO.IdealWeight;

import com.pehls.healthcare.Pessoa.Model.Man;
import com.pehls.healthcare.Pessoa.Model.PessoaBO;
import com.pehls.healthcare.Pessoa.Model.Woman;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by gabri on 03/11/2017.
 */

public class IdealWeightTest {
    private PessoaBO woman, man;
    IdealWeight idealWeight;
    @Before
    public void setUp () {
        woman = new PessoaBO(new Woman());
        man = new PessoaBO (new Man());
        idealWeight = new IdealWeight();
    }
    @Test
    public void idealWeight_assertWomanNotNull() throws Exception {
        assertNotNull(woman);
    }
    @Test
    public void idealWeight_assertManNotNull() throws Exception {
        assertNotNull(man);
    }
    @Test
    public void idealWeight_assertIdealWeightNotNull() throws Exception {
        assertNotNull(idealWeight);
    }
    @Test
    public void idealWeight_manIdealWeight() throws Exception {
        man.setHeight(1.75F);
        assertEquals(68.75F, idealWeight.calculate(man), 0.01F);
    }
    @Test
    public void idealWeight_womanIdealWeight() throws Exception {
        woman.setHeight(1.75F);
        assertEquals(62.5F, idealWeight.calculate(woman), 0.01F);
    }
    @Test
    public void idealWeight_manGetK() throws Exception {
        assertEquals(4, man.getK());
    }
    @Test
    public void idealWeight_womanGetK() throws Exception {
        assertEquals(2, woman.getK());
    }
}
