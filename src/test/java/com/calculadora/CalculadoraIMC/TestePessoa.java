package com.calculadora.CalculadoraIMC;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestePessoa {

	Pessoa pessoa;
	Masculino masc;
	Feminino fem;
	
	
	@AfterEach
	public void tearDown() {
		pessoa = null;
	}
	
	@Test
	public void testeImcPeso1() {	 
		pessoa = new Pessoa((float) 79, (float) 1.73);
		Assertions.assertEquals(26.395801544189453, pessoa.calcImc(79, (float) 1.73));
	}
	
	@Test
	public void testeImcPeso2() {	 
		pessoa = new Pessoa((float) 100, (float) 1.63);
		Assertions.assertEquals(35.462249755859375, pessoa.calcImc(79, (float) 1.73));
	}
	
	
	@Test
	public void PesoAdultBaixoGrave() {	 
		pessoa = new Pessoa((float) 34, (float) 1.84);
		Assertions.assertEquals("Baixo peso muito grave", pessoa.imcIdealAdulto());
	}
	
	@Test
	public void PesoAdultBaixoGraveFalha() {	 
		pessoa = new Pessoa((float) 79, (float) 1.84);
		Assertions.assertEquals("Baixo peso muito grave", pessoa.imcIdealAdulto());
	} 
	
	@Test
	public void PesoAdultBaixo() {	 
		pessoa = new Pessoa((float) 54, (float) 1.74);
		Assertions.assertEquals("Baixo Peso", pessoa.imcIdealAdulto());
	}
	
	@Test
	public void PesoAdultNormal() {	 
		pessoa = new Pessoa((float) 72, (float) 1.78);
		Assertions.assertEquals("Peso Normal", pessoa.imcIdealAdulto());
	}
	
	@Test
	public void PesoAdultNormalFalha() {	 
		pessoa = new Pessoa((float) 99, (float) 1.78);
		Assertions.assertEquals("Peso Normal", pessoa.imcIdealAdulto());
	}
	
	@Test
	public void PesoAdultSobrepeso() {	 
		pessoa = new Pessoa((float) 79, (float) 1.73);
		Assertions.assertEquals("Sobrepeso", pessoa.imcIdealAdulto());
	}
	
	@Test
	public void PesoAdultObsidadeGI() {	 
		pessoa = new Pessoa((float) 90, (float) 1.65);
		Assertions.assertEquals("Obsidade grau I", pessoa.imcIdealAdulto());
	}
	
	@Test
	public void PesoAdultObsidadeGII() {	 
		pessoa = new Pessoa((float) 100, (float) 1.63);
		Assertions.assertEquals("Obsidade grau II", pessoa.imcIdealAdulto());
	}
	
	@Test
	public void PesoidealMasc() {
		masc = new Masculino((float)100, (float)1.73);
		Assertions.assertEquals(65.69999694824219 ,masc.pesoIdealMasculino((float) 1.73));
		
	}
	
	@Test
	public void ImcHomemIdosoBaixoGrave() {
		masc = new Masculino((float)36, (float)1.73);
		Assertions.assertEquals("Baixo Peso" ,masc.imcHomemIdoso());
	}
	
	@Test
	public void ImcHomemIdosoNormalFalha() {
		masc = new Masculino((float)63, (float)1.64);
		Assertions.assertEquals("Obsidade grau I" ,masc.imcHomemIdoso());
	}
	
	@Test
	public void ImcMulherGravidaNormal() {
		fem = new Feminino((float)63, (float)1.63);
		Assertions.assertEquals("Peso Normal" ,fem.imcMulherGravida());
	}
	
	@Test
	public void ImcMulherGravidaSobrepeso() {
		fem = new Feminino((float)75, (float)1.64);
		Assertions.assertEquals("Sobrepeso" ,fem.imcMulherGravida());
	}
	
	@Test
	public void ImcMulherIdosaNormal() {
		fem = new Feminino((float)75, (float)1.69);
		Assertions.assertEquals("Peso Normal" ,fem.imcMulherIdosa());
	}
	
	@Test
	public void ImcMulherIdosaSobrepeso() {
		fem = new Feminino((float)85, (float)1.68);
		Assertions.assertEquals("Sobrepeso" ,fem.imcMulherIdosa());
	}
}
