package com.pehls.healthcare.Pessoa.Model;

import com.pehls.healthcare.Pessoa.BO.IMC;
import com.pehls.healthcare.Pessoa.BO.IdealWeight;
import com.pehls.healthcare.Pessoa.Model.Man;
import com.pehls.healthcare.Pessoa.Model.PessoaBO;
import com.pehls.healthcare.Pessoa.BO.TGC;
import com.pehls.healthcare.Pessoa.Model.Woman;
import com.pehls.healthcare.Utils.Person;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by gabri on 01/11/2017.
 */

public class PessoaBOTest {
    PessoaBO woman;
    PessoaBO man;
    @Before
    public void setUp () {
        woman = new PessoaBO(new Woman());
        man = new PessoaBO (new Man());
    }
    @Test
    public void person_womanNotNull() throws Exception {
        assertNotNull(woman);
    }
    @Test
    public void person_manNotNull() throws Exception {
        assertNotNull(man);
    }
    @Test
    public void person_isWoman() throws Exception {
        assertEquals("Woman", woman.getGender());
    }
    @Test
    public void person_isMan() throws Exception {
        assertEquals("Man", man.getGender());
    }
    @Test
    public void person_isWomanFlag() throws Exception {
        assertEquals(Person.isWoman, woman.getGenderFlag());
    }
    @Test
    public void person_isManFlag() throws Exception {
        assertEquals(Person.isMan, man.getGenderFlag());
    }
    @Test
    public void person_manGetWeight() throws Exception {
        man.setWeight(30);
        assertEquals(30.0F, man.getWeight());
    }
    @Test
    public void person_womanGetWeight() throws Exception {
        woman.setWeight(30);
        assertEquals(30.0F, woman.getWeight());
    }
    @Test
    public void person_manGetHeight() throws Exception {
        man.setHeight(1.75F);
        assertEquals(1.75F, man.getHeight());
    }
    @Test
    public void person_womanGetHeight() throws Exception {
        woman.setHeight(1.75F);
        assertEquals(1.75F, woman.getHeight());
    }
    @Test
    public void person_IMCNotNull() throws Exception {
        assertNotNull(new IMC());
    }
    @Test
    public void person_manCalculateIMC() {
        man.setWeight(30F).setHeight(1.75F);
        assertEquals(9.79F, man.calculateIMC(), 0.01F);
    }
    @Test
    public void person_womanCalculateIMC() {
        woman.setWeight(30F).setHeight(1.75F);
        assertEquals(9.79F, woman.calculateIMC(), 0.01F);
    }
    @Test
    public void person_manEvaluateIMCUnderWeight() {
        man.setWeight(30F).setHeight(1.75F);
        assertEquals("Abaixo do Peso", man.evaluateIMC());
    }
    @Test
    public void person_womanEvaluateIMCUnderWeight() {
        woman.setWeight(30F).setHeight(1.75F);
        assertEquals("Abaixo do Peso", woman.evaluateIMC());
    }
    @Test
    public void person_manEvaluateIMCOk() {
        man.setWeight(70F).setHeight(1.75F);
        assertEquals("Peso Ideal", man.evaluateIMC());
    }
    @Test
    public void person_womanEvaluateIMCOk() {
        woman.setWeight(70F).setHeight(1.75F);
        assertEquals("Peso Ideal", woman.evaluateIMC());
    }
    @Test
    public void person_manEvaluateIMCOverWeight() {
        man.setWeight(90F).setHeight(1.75F);
        assertEquals("Obeso", man.evaluateIMC());
    }
    @Test
    public void person_womanEvaluateIMCOverWeight() {
        woman.setWeight(90F).setHeight(1.75F);
        assertEquals("Obeso", woman.evaluateIMC());
    }
    @Test
    public void person_manGetAge() throws Exception {
        man.setAge(20);
        assertEquals(20, man.getAge());
    }
    @Test
    public void person_womanGetAge() throws Exception {
        woman.setAge(20);
        assertEquals(20, woman.getAge());
    }
    @Test
    public void person_TGCNotNull() throws Exception {
        assertNotNull(new TGC());
    }
    @Test
    public void person_manCalculateTGC() throws Exception {
        man.setAge(20).setHeight(1.70F).setWeight(90F);
        assertEquals(25.77F, man.calculateTGC(), 0.01F);
    }
    @Test
    public void person_womanCalculateTGC() throws Exception {
        woman.setAge(20).setHeight(1.70F).setWeight(90F);
        assertEquals(36.57F, woman.calculateTGC(), 0.01F);
    }
    @Test
    public void person_manEvaluateTGCNotAccept() throws Exception {
        man.setAge(20).setHeight(1.70F).setWeight(90F);
        assertEquals("Não aceitável", man.evaluateTGC());
    }
    @Test
    public void person_womanEvaluateTGCNotAccept() throws Exception {
        woman.setAge(20).setHeight(1.70F).setWeight(90F);
        assertEquals("Não aceitável", woman.evaluateTGC());

    }
    @Test
    public void person_manEvaluateTGCAccept() throws Exception {
        man.setAge(20).setHeight(1.70F).setWeight(56F);
        assertEquals("Aceitável", man.evaluateTGC());
    }
    @Test
    public void person_womanEvaluateTGCAccept() throws Exception {
        woman.setAge(20).setHeight(1.70F).setWeight(45F);
        assertEquals("Aceitável", woman.evaluateTGC());
    }
    @Test
    public void person_manEvaluateTGCIdeal() throws Exception {
        man.setAge(20).setHeight(1.70F).setWeight(48F);
        assertEquals("Ideal", man.evaluateTGC());
    }
    @Test
    public void person_womanEvaluateTGCIdeal() throws Exception {
        woman.setAge(20).setHeight(1.70F).setWeight(38F);
        assertEquals("Ideal", woman.evaluateTGC());
    }
    @Test
    public void person_womanGetS() throws Exception {
        assertEquals(0, woman.getS());
    }
    @Test
    public void person_manGetS() throws Exception {
        assertEquals(1, man.getS());
    }
    @Test
    public void person_manGetK() throws Exception {
        assertEquals(4, man.getK());
    }
    @Test
    public void person_womanGetK() throws Exception {
        assertEquals(2, woman.getK());
    }
    @Test
    public void person_IdealWeightNotNull() throws  Exception {
        assertNotNull(new IdealWeight());
    }
    @Test
    public void person_manIdealWeight() throws Exception {
        man.setHeight(1.75F);
        assertEquals(68.75F, man.calculateIdealWeight(), 0.01F);
    }
    @Test
    public void person_womanIdealWeight() throws Exception {
        woman.setHeight(1.75F);
        assertEquals(62.5F, woman.calculateIdealWeight(), 0.01F);
    }
}
