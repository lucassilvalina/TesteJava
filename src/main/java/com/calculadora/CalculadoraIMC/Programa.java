package com.calculadora.CalculadoraIMC;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu sexo (ex: Masculino/Feminio): ");
		Character sexo = sc.next().charAt(0);
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite sua altura: ");
		float altura = sc.nextFloat();
		System.out.print("Digite seu peso: ");
		float peso = sc.nextFloat();
		
		switch (sexo) {
		case 'M':
			Masculino masc = new Masculino(peso,altura);
			System.out.println("Seu IMC é: "+ masc.calcImc(peso, altura));
			if(idade>=18 && idade<=65) {
				System.out.println("Você apresenta: " + masc.imcIdealAdulto());
			}
			if(idade>65) {
				System.out.println("Você apresenta: " + masc.imcHomemIdoso());
			}
			break;
		case 'F' :
			Feminino fem = new Feminino(altura, peso);
			System.out.println("Seu IMC é: " + fem.calcImc(peso,altura));
			if(idade>=18 && idade<=65) {
				System.out.println("Você apresenta: " + fem.imcIdealAdulto());
			}
			if(idade>65) {
				System.out.println("Você apresenta: " + fem.imcMulherIdosa());
			}
		}
		sc.close();
	}
}
