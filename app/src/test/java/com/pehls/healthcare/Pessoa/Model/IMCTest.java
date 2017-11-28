package com.pehls.healthcare.Pessoa.Model;

import com.pehls.healthcare.Pessoa.BO.IMC;
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

public class IMCTest {
    PessoaBO woman, man;
    IMC imc;
    @Before
    public void setUp () {
        woman = new PessoaBO(new Woman());
        man = new PessoaBO (new Man());
        imc = new IMC();
    }
    @Test
    public void imc_assertWomanNotNull() throws Exception {
        assertNotNull(woman);
    }
    @Test
    public void imc_assertManNotNull() throws Exception {
        assertNotNull(man);
    }
    @Test
    public void imc_assertIMCNotNull() throws Exception {
        assertNotNull(imc);
    }
    @Test
    public void imc_manCalculateIMC() {
        man.setWeight(30F).setHeight(1.75F);
        assertEquals(9.79F, imc.calculate(man), 0.01F);
    }
    @Test
    public void imc_womanCalculateIMC() {
        woman.setWeight(30F).setHeight(1.75F);
        assertEquals(9.79F, imc.calculate(woman), 0.01F);
    }
    @Test
    public void imc_manEvaluateIMCUnderWeight() {
        man.setWeight(30F).setHeight(1.75F);
        assertEquals("Abaixo do Peso", imc.evaluate(man));
    }
    @Test
    public void imc_womanEvaluateIMCUnderWeight() {
        woman.setWeight(30F).setHeight(1.75F);
        assertEquals("Abaixo do Peso", imc.evaluate(woman));
    }
    @Test
    public void imc_manEvaluateIMCOk() {
        man.setWeight(70F).setHeight(1.75F);
        assertEquals("No Peso Ideal", imc.evaluate(man));
    }
    @Test
    public void imc_womanEvaluateIMCOk() {
        woman.setWeight(70F).setHeight(1.75F);
        assertEquals("No Peso Ideal", imc.evaluate(woman));
    }
    @Test
    public void imc_manEvaluateIMCOverWeight() {
        man.setWeight(90F).setHeight(1.75F);
        assertEquals("Obeso", imc.evaluate(man));
    }
    @Test
    public void imc_womanEvaluateIMCOverWeight() {
        woman.setWeight(90F).setHeight(1.75F);
        assertEquals("Obeso", imc.evaluate(woman));
    }
}
