package com.calculadora.CalculadoraIMC;

public class Feminino extends Pessoa {

	public Feminino(float peso, float altura) {
		super(peso, altura);
	}

	public float pesoIdealFeminino(float altura) {
		float pesoMulher = (float) ((float) ((altura * 100) - 100) * 0.85);
		return pesoMulher;
	}

	public String imcMulherGravida() {
		String PesoGravida = null;
		if (calcImc(getPeso(), getAltura()) <= 18.5) {
			PesoGravida = "Baixo Peso";
		} else if (calcImc(getPeso(), getAltura()) >= 18.5 && calcImc(getPeso(), getAltura()) <= 24.9) {
			PesoGravida = "Peso Normal";
		} else if (calcImc(getPeso(), getAltura()) >= 25.0 && calcImc(getPeso(), getAltura()) <= 29.9) {
			PesoGravida = "Sobrepeso";
		} else if (calcImc(getPeso(), getAltura()) >= 30.0) {
			PesoGravida = "Obsidade";
		}
		return PesoGravida;
	}

	public String imcMulherIdosa() {
		String PesoIdosa = null;
		if (calcImc(getPeso(), getAltura()) < 21.9) {
			PesoIdosa = "Baixo Peso";
		} else if (calcImc(getPeso(), getAltura()) >= 22 && calcImc(getPeso(), getAltura()) <= 27) {
			PesoIdosa = "Peso Normal";
		} else if (calcImc(getPeso(), getAltura()) >= 27.1 && calcImc(getPeso(), getAltura()) <= 32) {
			PesoIdosa = "Sobrepeso";
		} else if (calcImc(getPeso(), getAltura()) >= 32.1 && calcImc(getPeso(), getAltura()) <= 37) {
			PesoIdosa = "Obsidade grau I";
		} else if (calcImc(getPeso(), getAltura()) >= 37.1 && calcImc(getPeso(), getAltura()) <= 41.9) {
			PesoIdosa = "Obsidade grau II";
		} else if (calcImc(getPeso(), getAltura()) >= 42) {
			PesoIdosa = "Obsidade grau III (Obsidade mórbida)";
		}
		return PesoIdosa;
	}

}
