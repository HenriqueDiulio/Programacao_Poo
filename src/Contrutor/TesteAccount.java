package Contrutor;

import java.util.Scanner;

public class TesteAccount {
	public static void main(String[] args) {

		// instanciando a class Account
		Account myAccount1 = new Account("Conta1");
		Account myAccount2 = new Account("Conta2");

		// Scanner de Entrada

		Scanner input = new Scanner(System.in);

		// Vai exbir o nome que está na varivel name que está na outra class,
		// ele vai parar de executar esse arquivo e vai executar o outro onde esta a
		// varivel name.
		System.out.println("-------------- ACCOUNT -------------- "
				+ "\nNome inicial Account 1 é: " + myAccount1.getName()
				+ "\nNome inicial Account 2 é: " + myAccount2.getName());

		// ENTRADA DE DADOS // a variavel name vai receber;
		System.out.println("Digite o nome da sua conta 1:");
		String NewName1 = input.nextLine();
		System.out.println("Digite o nome da sua conta 2:");
		String NewName2 = input.nextLine();

		// vai pega o novo nome e vai setar na variavel name que está na class account
		myAccount1.setName(NewName1);
		myAccount2.setName(NewName2);
		
		System.out.println("O nome da conta é: " + myAccount1.getName());
		System.out.println("O nome da conta é: " + myAccount2.getName());

		
		input.close();
	}
}
