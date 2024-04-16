package Fundamentos;

import java.util.Scanner;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		// A presentação
		System.out.println("Welcome To Java" + "\nBem vindo a programação java orientada a objetos!!");

		try (// Scanner para fazer a entrada de dados.
				Scanner input = new Scanner(System.in)) {
			// Declaração de variaveis
			int numero1, numero2, soma;

			// Entrada de dados
			System.out.println("Digite o primeiro numero:");
			numero1 = input.nextInt();

			System.out.println("Digite o segundo numero:");
			numero2 = input.nextInt();

			// soma
			soma = numero1 + numero2;

			// resultado
			System.out.println("O resultado da soma é: " + soma);

		}
	}
}
