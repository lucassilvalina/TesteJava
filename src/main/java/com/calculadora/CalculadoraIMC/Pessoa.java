package com.calculadora.CalculadoraIMC;

public class Pessoa {
	private float peso, altura;
	
	public Pessoa() {
	}
	public Pessoa(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calcImc(float peso, float altura) {
		float imc = this.peso / (this.altura * altura);
		return imc;
	}

	public String imcIdealAdulto() {
		String imcPessoa = null;
		if (calcImc(getPeso(), getAltura()) <= 16) {
			imcPessoa = "Baixo peso muito grave";
		} else if (calcImc(getPeso(), getAltura()) >= 16 && calcImc(getPeso(), getAltura()) <= 16.99) {
			imcPessoa = "Baixo peso grave";
		} else if (calcImc(getPeso(), getAltura()) >= 17 && calcImc(getPeso(), getAltura()) <= 18.46) {
			imcPessoa = "Baixo Peso";
		} else if (calcImc(getPeso(), getAltura()) >= 18.50 && calcImc(getPeso(), getAltura()) <= 24.99) {
			imcPessoa = "Peso Normal";
		} else if (calcImc(getPeso(), getAltura()) >= 25 && calcImc(getPeso(), getAltura()) <= 29.99) {
			imcPessoa = "Sobrepeso";
		} else if (calcImc(getPeso(), getAltura()) >= 30 && calcImc(getPeso(), getAltura()) <= 34.99) {
			imcPessoa = "Obsidade grau I";
		} else if (calcImc(getPeso(), getAltura()) >= 35 && calcImc(getPeso(), getAltura()) <= 39.99) {
			imcPessoa = "Obsidade grau II";
		} else if (calcImc(getPeso(), getAltura()) >= 40) {
			imcPessoa = "Obsidade grau III (Obsidade mórbida)";
		}
		return imcPessoa;
	}

}

