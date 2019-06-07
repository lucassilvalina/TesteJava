package com.calculadora.CalculadoraIMC;

public class Masculino extends Pessoa {

	public Masculino(float peso, float altura) {
		super(peso, altura);
	}

	public float pesoIdealMasculino(float altura) {
		float pesoHomem = (float) ((float) ((altura * 100) - 100) * 0.90);
		return pesoHomem;
	}

	public String imcHomemIdoso() {
		String PesoIdoso = null;
		if (calcImc(getPeso(), getAltura()) < 21.9) {
			PesoIdoso = "Baixo Peso";
		} else if (calcImc(getPeso(), getAltura()) >= 22 && calcImc(getPeso(), getAltura()) <= 27) {
			PesoIdoso = "Peso Normal";
		} else if (calcImc(getPeso(), getAltura()) >= 27.1 && calcImc(getPeso(), getAltura()) <= 30) {
			PesoIdoso = "Sobrepeso";
		} else if (calcImc(getPeso(), getAltura()) >= 30.1 && calcImc(getPeso(), getAltura()) <= 35) {
			PesoIdoso = "Obsidade grau I";
		} else if (calcImc(getPeso(), getAltura()) >= 35.1 && calcImc(getPeso(), getAltura()) <= 39.9) {
			PesoIdoso = "Obsidade grau II";
		} else if (calcImc(getPeso(), getAltura()) >= 40) {
			PesoIdoso = "Obsidade grau III (Obsidade mórbida)";
		}
		return PesoIdoso;
	}

}
